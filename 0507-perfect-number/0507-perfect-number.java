class Solution {
    public boolean checkPerfectNumber(int a) {
        if(a<=1)
        return false;
        int sum=1;
        int n=(int) Math.sqrt(a);
       for(int i=2;i<=n;i++){
if(a%i==0)
{
    sum=sum+i;

if(i!=a/i)
{
    sum=sum+a/i;
}
   }   }
        
        
        if(sum==a)
        return true;
        else
        return false;
    }
}