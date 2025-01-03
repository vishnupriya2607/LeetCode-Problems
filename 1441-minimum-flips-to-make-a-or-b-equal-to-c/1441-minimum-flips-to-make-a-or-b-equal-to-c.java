class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        while(a!=0 ||b!=0 ||c!=0)
        {
            int f1=a%2;
            int f2=b%2;
            int f3=c%2;
           // System.out.print(f1|f2);
            if(f3==1)
            {
                if(f2==0 && f1==0)
                count++;
                
            }
            else
            {
                if(f1==1)
                count++;
                if(f2==1)
                count++;
            }
            a=a/2;
            b=b/2;
            c=c/2;
        }
        return count;
    }
}