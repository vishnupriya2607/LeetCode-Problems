class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
      
            List<Integer> li=new ArrayList<>();
        if(len1<=len2)
        {
            for(int i=0;i<nums1.length;i++)
            {
                for(int j=0;j<nums2.length;j++)
                {
                    if(nums1[i]==nums2[j])
                    {
                        nums2[j]=-1;
                        li.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        else
        {
            for(int i=0;i<nums2.length;i++)
            {
                for(int j=0;j<nums1.length;j++)
                {
                    if(nums2[i]==nums1[j])
                    {
                        nums1[j]=-1;
                        li.add(nums2[i]);
                        break;
                    }
                }
            }

        }
        int k=0;
        int arr[]=new int[li.size()];
        for(int i:li)
        {
            arr[k++]=i;
        }
        return arr;
    }
}