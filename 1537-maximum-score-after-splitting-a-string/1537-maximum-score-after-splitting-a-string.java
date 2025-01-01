class Solution {
    public int maxScore(String s) {
        int t=0,o=0,z=0,b=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                t++;
            }
        }
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')z++;
            else
            o++;
            int curr=z+(t-o);
            b=Math.max(b,curr);

        }
        return b;
    }
}