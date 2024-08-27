public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int res = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            System.out.println(prevEnd);
            if (prevEnd > intervals[i][0]) {
                res++;
            } else {
                prevEnd = intervals[i][1];
            }
        }

        return res;
    }
}