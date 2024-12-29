class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        //System.out.print(map);
       
           for(int []a:operations)
{
int old=a[0];
int new1=a[1];
if(map.containsKey(old))
{
    int index=map.get(old);
    map.remove(old);
    map.put(new1,index);
    nums[index]=new1;

}
}
           
return nums;
    }
}