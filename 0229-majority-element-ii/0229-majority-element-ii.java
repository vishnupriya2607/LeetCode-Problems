class Solution {
    public List<Integer> majorityElement(int[] nums) {
       // Arrays.sort(nums);
        int n=nums.length;
        int max=n/3;
        List<Integer> li=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
        int c=0;
        for(int j=0;j<n;j++)
        {
            if(nums[i]==nums[j])
            {
                c++;
            }
        }
        if(c>max)
        {
            if(!li.contains(nums[i]))
            {

            
            li.add(nums[i]);
            }
        }
       }
       return li;
    }
}