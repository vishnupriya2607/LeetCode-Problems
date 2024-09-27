class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> li=new ArrayList<>();
        int t=0,result=0,count=1;
       // li.add(1);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                li.add(count);
                count=1;
            }
            else
            {
                count++;
            }
        }
        li.add(count);
       
        for(int i=1;i<li.size();i++)
        {
            result+=Math.min(li.get(i-1),li.get(i));
        }
        return result;
    }
}