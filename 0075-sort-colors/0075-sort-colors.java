class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int m=0,i=0;
while(m<=h)
{
    if(nums[m]==0)
    {
        swap(nums,m,l);
        m++;
        l++;
    }
    else if(nums[m]==1)
    {
        m++;
    }
   else if(nums[m]==2)
    {
        swap(nums,m,h);
        h--;
    }
    
}
    }
    public static void swap(int nums[],int i,int j)
    {
int temp=nums[i];
nums[i]=nums[j];
nums[j]=temp;

    }
}