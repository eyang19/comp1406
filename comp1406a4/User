import java.util.ArrayList;

public class User {
    private String     userName;
    private boolean    online;
    private ArrayList<Song> songList;
    private String space;

    public User()  { this(""); }

    public User(String u)  {
        userName = u;
        online = false;
        songList = new ArrayList<>();
        space = " ";
    }

    public ArrayList<Song> getSongList() {return songList;}
    public String getUserName() { return userName; }
    public boolean isOnline() { return online; }


    public void addSong(Song s){
        s.setOwner(this);
        songList.add(s);

    }

    public int totalSongTime(){
        int total = 0;
        for(Song s: songList){
            total += s.getDuration();
        }
        return total;
    }

    public void register(MusicExchangeCenter m){
        m.registerUser(this);
    }

    public void logon(MusicExchangeCenter m){
        if(m.userWithName(userName) != null){
            online = true;
        }
    }

    public void logoff(MusicExchangeCenter m){
        if(m.userWithName(userName)!= null){
            online = false;
        }
    }

    public Song getSongWithTitle(String s){
        for(Song song: songList){
            if(song.getTitle().equals(s)){
                return song;
            }
        }
        return null;
    }

    public ArrayList<String> requestCompleteSonglist(MusicExchangeCenter m){
        ArrayList<String> listString = new ArrayList<String>();
        int count = 0;
        listString.add(String.format("%-34s%-16s%-7s%-2s","tittle", "artist", "time", "owner"));
        listString.add("");
        for(Song s: m.allAvailableSongs()){
            listString.add(String.format( "%2d. %-30s%-16s%d:%02d%-3s%-1s", ++count, s.getTitle(), s.getArtist(), s.getMinutes(), s.getSeconds(),space,s.getOwner().getUserName()));
        }
        return listString;
    }

    public ArrayList<String> requestSonglistByArtist(MusicExchangeCenter m,String artist){
        ArrayList<String> listString = new ArrayList<String>();
        int count =0;
        listString.add(String.format("%-34s%-16s%-7s%-2s"," tittle", "artist", "time", "owner"));
        listString.add("");
        for(Song s: m.availableSongsByArtist(artist)){
            listString.add(String.format( "%2d. %-30s%-16s%d:%02d%-3s%-1s", ++count, s.getTitle(), s.getArtist(), s.getMinutes(), s.getSeconds(),space,s.getOwner().getUserName()));
        }

        return listString;
    }



    public String toString()  {
        String s = "" + userName + ":" + songList.size() +"songs (";
        if (!online) s += "not ";
        return s + "online)";
    }

    public void downloadSong(MusicExchangeCenter m, String title, String ownerName){
        Song toDownloadSong = m.getSong(title,ownerName);
        if(toDownloadSong != null){
            Song newSong = new Song(toDownloadSong.getTitle(), toDownloadSong.getArtist(),toDownloadSong.getMinutes(),toDownloadSong.getSeconds());
            newSong.setOwner(this);
            songList.add(newSong);

        }
    }
}
