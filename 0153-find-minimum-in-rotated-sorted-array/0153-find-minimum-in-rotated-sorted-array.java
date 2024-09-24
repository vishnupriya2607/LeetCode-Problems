class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            System.out.println(nums[mid]);
            if(nums[mid]>=nums[l] && nums[mid+1]<nums[l])
            return nums[mid+1];
            else if(nums[mid]<nums[l] && nums[mid-1]>nums[l])
            {
return nums[mid];
            }
            else if(nums[mid]>nums[l] && nums[mid+1]>nums[l])
            {
l=mid;
            }
            else
            {
                r=mid;
            }
            
        }
        return nums[0];
            }
}