//Note: All of your TrieMapInterface method implementations must function recursively
//I have left the method signatures from my own solution, which may be useful hints in how to approach the problem
//You are free to change/remove/etc. any of the methods, as long as your class still supports the TrieMapInterface
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class TrieMap implements TrieMapInterface{
    TrieMapNode root;

    public TrieMap(){
        root = new TrieMapNode();
    }

    //Indirectly recursive method to meet definition of interface
    public void put(String key, String value){
        if(key == ""){
            return;
        }
        put(root,key,value,0);

    }

    //Recursive method
    //Note: arguments are only a suggestion, you may use your own if you devise a different recursive solution
    public void put(TrieMapNode current, String key, String value, int depth){
        HashMap<Character, TrieMapNode> children = current.getChildren();

        if(value == current.getValue()) {
            return;
        }

        if(depth >= key.length()){
            depth = key.length()-1;
        }
        Character findThisChar = key.charAt(depth);
        TrieMapNode nextNode = children.get(findThisChar);

        if (nextNode == null){
            if(depth == key.length() - 1) {
                current.addChildNode(findThisChar, value);
                return;
            }else{
                nextNode = current.addChildNode(findThisChar,null);
            }
        }
        put(nextNode,key,value,++depth);
    }

    //Indirectly recursive method to meet definition of interface
    public String get(String key){
        return get(root,key,0);
    }

    //Recursive method
    //Note: arguments are only a suggestion, you may use your own if you devise a different recursive solution
    public String get(TrieMapNode current, String key,int depth){
        HashMap<Character, TrieMapNode> children = current.getChildren();

        if(key.equals(current.getValue())){
            return current.getValue();
        }

        if(depth >= key.length()){
            depth = key.length()-1;
        }
        Character findThisChar = key.charAt(depth);
        TrieMapNode nextNode = children.get(findThisChar);
        if(nextNode == null){
            return null;
        }
        return get(nextNode,key,depth+1);

    }

    //Indirectly recursive method to meet definition of interface
    public boolean containsKey(String key){
        if(key == ""){
            return false;
        }
        return containsKey(root,key,0);

    }

    //Recursive method
    //Note: arguments are only a suggestion, you may use your own if you devise a different recursive solution
    public boolean containsKey(TrieMapNode current, String key,int depth){
        HashMap<Character, TrieMapNode> children = current.getChildren();

        if (current.getValue() == key){
            return true;
        }
        if(depth >= key.length()){
            depth = key.length()-1;
        }
        Character findThisChar = key.charAt(depth);
        TrieMapNode nextNode = children.get(findThisChar);
        if(nextNode == null){
            return false;
        }
        return containsKey(nextNode,key,depth+1);


    }

    //Indirectly recursive method to meet definition of interface
    public ArrayList<String> getKeysForPrefix(String prefix){
        TrieMapNode node = findNode(root, prefix, 0);
        if(node != null) {
            return getSubtreeKeys(node);
        }else{
            return new ArrayList<>();
        }
    }

    //Recursive helper function to find node that matches a prefix
    //Note: only a suggestion, you may solve the problem is any recursive manner
    public TrieMapNode findNode(TrieMapNode current, String prefix, int depth){
        HashMap<Character, TrieMapNode> children = current.getChildren();

        if(depth == prefix.length()){
            return current;
        }

        Character findThisChar = prefix.charAt(depth);
        TrieMapNode nextNode = children.get(findThisChar);

        if(nextNode == null){
            return null;
        }

        return findNode(nextNode,prefix,depth+1);
    }


    //Recursive helper function to get all keys in a node's subtree
    //Note: only a suggestion, you may solve the problem is any recursive manner
    public ArrayList<String> getSubtreeKeys(TrieMapNode current){

        ArrayList<String> arr = new ArrayList<>();

        if (current.getValue() != null) {
            arr.add(current.getValue());
        }

        Collection<TrieMapNode> childrenNodes = current.getChildren().values();

        for (TrieMapNode n : childrenNodes) {
            ArrayList<String> subList = getSubtreeKeys(n);

            for (String s : subList) {
                arr.add(s);
            }
        }


        return arr;
    }
    //Indirectly recursive method to meet definition of interface
    public void print(){
        print(root);
    }

    //Recursive method to print values in tree
    public void print(TrieMapNode current){
        HashMap<Character, TrieMapNode>children = current.getChildren();

        String word = current.getValue();

        if(word != null){
            System.out.println(word);
        }
        for (HashMap.Entry<Character, TrieMapNode> n : children.entrySet())
        { TrieMapNode value = n.getValue();
            print(value);
        }
    }

    public static void main(String[] args){
        //You can add some code in here to test out your TrieMap initially
        //The TrieMapTester includes a more detailed test
    }
}
