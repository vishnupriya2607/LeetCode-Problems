class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points ,(a,b)->Integer.compare(a[1],b[1]));
        int end=points[0][1];
        int c=points.length;
        for(int i=1;i<points.length;i++)
        {
            if(end>=points[i][0])
            c--;
            else
            end=points[i][1];
        }
        
            return c;
        
    }
}