class Solution {
    public boolean isSubsequence(String s, String t) {
      int last=-1;
      for(int i=0;i<s.length();i++)
      {
         last=(t.indexOf(s.charAt(i),last+1));
        if(last==-1)
        return false;
      }
      return true;
    }
}