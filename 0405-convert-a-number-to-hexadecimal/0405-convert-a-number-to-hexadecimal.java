class Solution {
    public String toHex(int num) {
        String sum="";
        long n=num;
       if(n<0)
         n = (long)((Math.pow(2,32)) + n);
       if(n==0)return "0";
        while(n!=0)
        {
            long rem=n%16;
           if(rem>9)
           {
            char c=(char)(rem+87);
            sum=c+sum;
           }
           else
            sum=rem+sum;
            n=n/16;
        }
        return sum;
    }
}