class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int l=0;
        int r=nums.size()-1;
        int count=0;
        Collections.sort(nums);
        
        while(l<r)
        {
            if(nums.get(l)+nums.get(r)<target)
            {
                count+=r-l;
                l++;
            }
            else
            {
                r--;

            }
        }
        return count;
    }
}