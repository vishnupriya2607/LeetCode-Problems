class Solution {
    public int addDigits(int num) {
    int n=num,rem,rev=0;
    while(n>0||rev>9)
    {
   if(n==0)
   {
       n=rev;
       rev=0;
   }
        rem=n%10;
       rev=rev+rem;
        n=n/10;
    }
  
    return rev;
} 
    
}