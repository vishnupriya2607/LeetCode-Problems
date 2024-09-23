class Solution {
    public int nthUglyNumber(int n) {
        int []arr=new int[n];
        arr[0]=1;
        int p1=0,p2=0,p3=0;
     for(int i=1;i<n;i++)
     {
       int min=Math.min((arr[p1]*2),Math.min(arr[p2]*3,arr[p3]*5));
        if(min==arr[p1]*2)p1++;
        if(min==arr[p2]*3)p2++;
        if(min==arr[p3]*5)p3++;
        arr[i]=min; 
    }
     return arr[n-1];
    }
}