class Solution {
    public int climbStairs(int n) {
        int i=0;
        int j=1;

        for (int k = 0; k <n; k++) {
            int t=i+j;
            i=j;
            j=t;
        }

        return j;        
    }
}