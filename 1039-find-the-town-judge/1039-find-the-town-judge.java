class Solution {
    public int findJudge(int n, int[][] trust) {
        int a1[]=new int[n+1];
        int a2[]=new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            int a=trust[i][0];
            int b=trust[i][1];
            a1[a]++;
            a2[b]++;
        }
        int out=-1;
       for(int i=1;i<n+1;i++)
       {
        if(a1[i]==0 && a2[i]==n-1)
        {
            out=i;
        }
       }
    return  out;
    }
}