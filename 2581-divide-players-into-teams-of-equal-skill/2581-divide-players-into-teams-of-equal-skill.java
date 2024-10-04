class Solution {
    public long dividePlayers(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int a=sum/(n/2);
        if(sum%(n/2)!=0)
        return -1;
        long sum2=0,sum1=0,c=0;
        Arrays.sort(arr);
       for(int i=0;i<n/2;i++)
       {
            if((arr[i]+arr[n-i-1])!=a)
            {
                return -1;
            }
        
          sum2 += (long) arr[i] * arr[n - 1 - i];
            
       }
            
        
      
       return sum2;
    }
}