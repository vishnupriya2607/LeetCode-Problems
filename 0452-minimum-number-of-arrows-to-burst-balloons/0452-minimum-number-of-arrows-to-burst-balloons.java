class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int c=points.length;
        int prev=points[0][1];
        for(int i=1;i<points.length;i++)
        {
if(prev>=points[i][0])
c--;
else
prev=points[i][1];
        }
    return c;}

}