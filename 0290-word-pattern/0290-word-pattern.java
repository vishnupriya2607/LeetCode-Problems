class Solution {
    public boolean wordPattern(String pattern, String s) {
      HashMap<Character,String> m=new HashMap<>();
      String []str=s.split(" ");
      if(pattern.length()!=str.length)
      return false;
      for(int i=0;i<str.length;i++)
      {
        char ch=pattern.charAt(i);
        if(m.containsKey(ch))
        {
            String st=m.get(ch);
            if(!(st.equals(str[i])))
            return false;
        }
        else
        {
            if(m.containsValue(str[i]))
            return false;
        }
        m.put(ch,str[i]);
      }
      return true;
    }
}