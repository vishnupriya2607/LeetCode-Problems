class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int c=0;
        long l=0;
      for(int i=0;i<nums.length-1;i++)
      {
     l=l+nums[i];
       long  r=sum-l;
        if(l>=r)
        {
            c++;
        }
       
      }
      return c;  
    }
}