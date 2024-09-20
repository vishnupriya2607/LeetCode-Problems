class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
       doubled=doubled.substring(1,doubled.length()-1);
        return doubled.contains(s);
    }
}