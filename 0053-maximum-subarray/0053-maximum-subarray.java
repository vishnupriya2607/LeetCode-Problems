class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0],s=0,e=0,t=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>max)
            {max=sum;
            s=t;
            e=i;
            }
            if(sum<0) {  
            sum=0;
            t=i+1;}


        }
        
        return max;
    }
}
