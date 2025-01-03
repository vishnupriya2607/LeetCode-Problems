class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int s=0;
        int e=n-1;
        int res=0;
        while(s<=e)
        {
            res=Math.max(res,(e-s)*(Math.min(height[s],height[e])));
            if(height[s]<height[e])
            s++;
            else
            e--;
        }
        return res;
    }
}