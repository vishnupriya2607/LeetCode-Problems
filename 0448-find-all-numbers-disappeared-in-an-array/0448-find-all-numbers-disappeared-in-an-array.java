class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int[]a=new int[nums.length+1];
        for(int num:nums)
        {
            a[num]=1;
        }
       for(int i=1;i<=nums.length;i++)
       {
if(a[i]!=1)
li.add(i);
       }
        
        return li;
    }
}