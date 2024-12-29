class Solution {
    public int heightChecker(int[] heights) {
        int [] arr=new int[heights.length];
        int n=heights.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=heights[i];
        }
        int c=0;
        Arrays.sort(heights);
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=heights[i])
            c++;
        }
        return c;
    }
}