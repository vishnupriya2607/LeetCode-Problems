class Solution {
    public int longestPalindrome(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
      int c=0,flag=0;
      for(int i=0;i<s.length();i++)
      {
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      }
      for(Map.Entry<Character,Integer> entry:map.entrySet())
      {
        if(entry.getValue()%2==0)
        {
            c+=entry.getValue();
        }
        else
        {
            c+=entry.getValue()-1;
            flag=1;
        }
      }
      if(flag==1)
      return c+1;
      else
      return c;
    }
}