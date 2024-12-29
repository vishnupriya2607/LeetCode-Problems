class Solution {
    public boolean checkPerfectNumber(int a) {
        int sum=0;
       for(int i=1;i<=a/2;i++){
if(a%i==0)
{
    sum=sum+i;
}
       }
        
        
        if(sum==a)
        return true;
        else
        return false;
    }
}