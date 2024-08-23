class Solution {
    public boolean isMonotonic(int[] nums) {
        int flag=0,f=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                flag+=1;
            }
            if(nums[i]>nums[i+1])
            {
                f+=1;
            }
        }
        if(f==0||flag==0)
        return true;
        else
        return false;
    }
}