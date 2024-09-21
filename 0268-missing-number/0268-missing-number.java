class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int l=nums.length;
        Arrays.sort(nums);
        while(s<l)
        {
            int mid=s+(l-s)/2;
            if(mid==nums[mid])
                s=mid+1;
            else
                l=mid;
        }
        return s;
    }
}