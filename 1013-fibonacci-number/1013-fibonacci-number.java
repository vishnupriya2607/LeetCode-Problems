class Solution {
    public int fib(int n) {
       int a=0;
       int b=1;
       int sum=0;
       for(int i=0;i<n;i++)
       {
        a=b;
        b=sum;
        sum=a+b;
      
       } 
       return sum;
    }
}