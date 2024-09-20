class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letterFrequency = new int[26];
        if(s.length()!=t.length())
        return false;
        for (char c : s.toCharArray()) 
            letterFrequency[c - 'a']++;
        for (char c : t.toCharArray()) {
            letterFrequency[c - 'a']--;
        if(letterFrequency[c-'a']<0)
            return false;
        }
        return true;
    }
}