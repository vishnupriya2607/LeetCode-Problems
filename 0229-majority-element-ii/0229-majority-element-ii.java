class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
    for(Map.Entry<Integer,Integer> entry:map.entrySet())
    {
        if(entry.getValue()>nums.length/3)
        {
            li.add(entry.getKey());
        }
    }
    return li;
    }
}