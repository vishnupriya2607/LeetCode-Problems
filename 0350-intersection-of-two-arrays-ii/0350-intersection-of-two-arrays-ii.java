class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1=nums1.length;
        int len2=nums2.length;
        List<Integer> li=new ArrayList<>();
        int i=0,j=0;
        while(i<len1 && j<len2)
        {
if(nums1[i]<nums2[j])
{
    i++;
}
else if(nums1[i]>nums2[j])
{
    j++;
}
else if( nums1[i]==nums2[j])
{
    li.add(nums1[i]);
    i++;
    j++;
}
        }
       int arr[]=new int[li.size()];
       int k=0;
       for(int val:li)
       {
        arr[k++]=val;
       }
        return arr;
        
    }
}