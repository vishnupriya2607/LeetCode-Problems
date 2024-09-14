class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr=new int[nums.length];
        int [] arr1=new int[nums.length];
        arr[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            arr[i]=arr[i-1]*nums[i-1];
        }
        arr1[arr1.length-1]=1;
        for(int i=arr1.length-2;i>=0;i--)
        {
            arr1[i]=arr1[i+1]*nums[i+1];
        }
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=arr[i]*arr1[i];
        }
        return arr;
    }
}