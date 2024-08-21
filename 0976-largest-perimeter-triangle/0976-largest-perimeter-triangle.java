class Solution {
    public int largestPerimeter(int[] nums) {
        int sum=0,max=0,s=0;
        Arrays.sort(nums);
       
        for(int i=0;i<nums.length-2;i++)
        {
                sum=nums[i]+nums[i+1];
                if(sum>nums[i+2])
                {
                    s=nums[i]+nums[i+1]+nums[i+2];
                    if(max<s)
                    {
                   max=s;
                   System.out.println(max);
                   
                    }
                }
            
        }
    
    return s;
    }
}