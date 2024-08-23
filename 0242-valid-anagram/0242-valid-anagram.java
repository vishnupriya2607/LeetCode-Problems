class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int n1=t.length();
        if(n==n1)
        {
 char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
 char[] c= t.toCharArray();
        Arrays.sort(c);
        s=new String(charArray);
        t=new String(c);
        return s.equals(t);
        }
        else
        {
            return false;
        }
    }
}