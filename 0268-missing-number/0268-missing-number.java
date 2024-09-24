class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,sum1=0;
       for(int i=1;i<=nums.length;i++)
       {
        sum=sum+i;
        sum1=sum1+nums[i-1];
       }
       return sum-sum1;
       }
      
       
    
}