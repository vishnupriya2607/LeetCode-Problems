class Solution {
    public int[] countBits(int n) {
        int []n1=new int[n+1];
        for(int j=0;j<=n;j++)
        {
            int c=0,i=j;
            while(i!=0){
if(i%2==1)
c++;
i/=2;

            }
            n1[j]=c;
        }
        return n1;
    }
}