class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int lef=0,rig=0,sum=0;
       
        for(int i=0;i<n;i++)
        {
            lef=Math.max(lef,height[i]);
            left[i]=lef;
        }
        for(int i=n-1;i>=0;i--)
        {
            rig=Math.max(rig,height[i]);
            right[i]=rig;
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+(Math.min(right[i],left[i])-height[i]);
        }
        return sum;
    }
}