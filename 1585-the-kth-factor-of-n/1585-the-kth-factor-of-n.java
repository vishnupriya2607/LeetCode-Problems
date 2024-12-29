class Solution {
    public int kthFactor(int n, int k) {
        int sum=0,c=0;
    int n1=(int)Math.sqrt(n);
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=i;
                c++;
                if(c==k)
                return sum;
            }
        }
if(c==k-1)
return n;
        return -1;
    }
}