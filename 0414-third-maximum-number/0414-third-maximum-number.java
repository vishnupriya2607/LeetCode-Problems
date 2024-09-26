class Solution {
    public int thirdMax(int[] nums) {
       long max1=Long.MIN_VALUE,max2=Long.MIN_VALUE,max3=Long.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
       
        if( max1<nums[i])
        {
          max3=max2;
            max2=max1;
            max1=nums[i];

        }
        else if(max1>nums[i] && max2<nums[i])
        {
            max3=max2;
            max2=nums[i];
        }
        else if(max2>nums[i] && max3<nums[i])
        {
            max3=nums[i];
        }
       }
      return max3!=Long.MIN_VALUE ?(int) max3:(int)max1;

    }
}