// Time Complexity: O(length of the word)
class Trie {
public class TrieNode{
    boolean isEnd;
    TrieNode []children;

    public TrieNode(){
        children = new TrieNode[26];
    }
}

TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    // Space Complexity: O(1)
    public void insert(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(curr.children[c-'a'] == null){
            curr.children[c-'a']= new TrieNode();
           
            }
            curr=curr.children[c-'a']; 
        }
        curr.isEnd=true;
    }
    
    // Space Complexity: O(1)
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(curr.children[c-'a'] == null) return false;
            curr = curr.children[c-'a'];
        }
        return curr.isEnd;
    }
    
    // Space Complexity: O(1)
    public boolean startsWith(String prefix) {
         TrieNode curr = root;
        for(int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            if(curr.children[c-'a'] == null) return false;
            curr = curr.children[c-'a'];
        }
        return true;
    }
}
