import java.util.*;

public class MusicExchangeCenter {
    private ArrayList<User> userList;
    private ArrayList<Song> downloadedSongs;
    private HashMap<String,Float> royalties;

    public ArrayList<User> getUserList(){
        return userList;
    }
    public ArrayList<Song> getDownloadedSongs(){
        return downloadedSongs;
    }
    public HashMap<String, Float>getRoyalties(){
        return royalties;
    }

    public MusicExchangeCenter() {
        userList = new ArrayList<>();
        downloadedSongs = new ArrayList<>();
        royalties = new HashMap<>();
    }

    public void displayRoyalties() {
        System.out.println(String.format("%-9s%-11s%n------------------", "Amount", "Artist"));
        for (String curArtist : royalties.keySet())
            System.out.println(String.format("%n$%-7.2f%-11s", royalties.get(curArtist), curArtist));
    }

    public ArrayList<User> onlineUsers() {
        ArrayList<User> online = new ArrayList<User>();
        for (User u : userList) {
            if (u.isOnline()) {
                online.add(u);
            }
        }
        return online;
    }

    public ArrayList<Song> allAvailableSongs() {
        ArrayList<Song> avSongs = new ArrayList<Song>();
        for (User u : onlineUsers()) {
            avSongs.addAll(u.getSongList());
        }
        return avSongs;
    }

    public String toString() {
        return "Music Exchange Center" + "(" + onlineUsers().size() + " users on line, " + allAvailableSongs().size() + " songs available)";
    }

    public User userWithName(String S) {
        for (User u : userList) {
            if (u.getUserName().equalsIgnoreCase(S)) {
                return u;
            }
        }
        return null;
    }

    public void registerUser(User X) {
        if (userWithName(X.getUserName()) == null) {
            userList.add(X);
        }
    }

    public TreeSet<Song> uniqueDownloads(){ return (new TreeSet<>(downloadedSongs)); }


    public Song getSong(String title, String ownerName) {
        for (User u : onlineUsers())
            for (Song s : u.getSongList())
                if (s.getTitle().equals(title) && s.getOwner().getUserName().equals(ownerName)) {
                    if (royalties.containsKey(s.getArtist()))
                        royalties.put(s.getArtist(), (float)(royalties.get(s.getArtist()) + 0.25));
                    else
                        royalties.put(s.getArtist(), 0.25f);
                    downloadedSongs.add(s);
                    for (Song songS : uniqueDownloads())
                        if (songS.getTitle().equals(s.getTitle())) {
                            songS.setDownloads(songS.getDownloads() + 1);
                        }
                    return s;
                }
        return null;
    }


    public ArrayList<Song> availableSongsByArtist(String artist) {
        ArrayList<Song> songByArtist = new ArrayList<>();
        for (Song s : allAvailableSongs()) {
            if (s.getArtist().equalsIgnoreCase(artist)) {
                songByArtist.add(s);
            }
        }
        return songByArtist;
    }

    private ArrayList<Pair<Integer,Song>>downloadsTracker(){
        ArrayList<Pair<Integer,Song>>dt = new ArrayList<>();
        for(Song s:uniqueDownloads())
            dt.add(new Pair<>(s.getDownloads(),s));
        return dt;
    }
    public ArrayList<Pair<Integer,Song>>songsByPopularity(){
        ArrayList<Pair<Integer,Song>>dt = downloadsTracker();
        Collections.sort(dt, new Comparator<Pair<Integer, Song>>() {
            @Override
            public int compare(Pair<Integer, Song> o1, Pair<Integer, Song> o2) {
                return -(o1.getKey() - o2.getKey());
            }
        });
        return dt;
        }

    }
