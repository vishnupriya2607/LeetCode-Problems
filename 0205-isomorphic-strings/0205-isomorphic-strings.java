class Solution {
    public boolean isIsomorphic(String s, String t) {
        int l=s.length();
        int r=t.length();
        HashMap<Character,Character> map=new HashMap<>();
        if(l!=r)
        return false;
        for(int i=0;i<l;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                char ch=map.get(s.charAt(i));
                if(ch!=(t.charAt(i)))
                return false;
            }
            else
            {
                if(map.containsValue(t.charAt(i)))
                return false;
            }
            map.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}