class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEnd = false; // Marks the end of a word
}

class Trie {
private TrieNode root;
    public Trie() {
         root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray())
        {
curr=curr.children.computeIfAbsent(c,k->new TrieNode());

        }
        curr.isEnd=true;
        
    }
    
    public boolean search(String word) {
         TrieNode curr =root;
        for (char c : word.toCharArray()) {
            curr = curr.children.get(c);
            if (curr == null) {
                return false; // Character not found
            }
        }
        return curr.isEnd; // Check if it's the end of the word
    }
    
    
    public boolean startsWith(String prefix) {
         TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            curr = curr.children.get(c);
            if (curr == null) {
                return false; // Prefix not found
            }
        }
        return true; // Prefix exists
    }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */