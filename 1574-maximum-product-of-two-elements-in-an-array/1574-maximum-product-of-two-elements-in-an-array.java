class Solution {
    public int maxProduct(int[] nums) {
        int m1=0,m2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(m1<=nums[i])
            {
                m2=m1;
                m1=nums[i];
            }
            else if(nums[i]>m2)
            {
                m2=nums[i];
            }
        }
        return (m1-1)*(m2-1);
    }
}