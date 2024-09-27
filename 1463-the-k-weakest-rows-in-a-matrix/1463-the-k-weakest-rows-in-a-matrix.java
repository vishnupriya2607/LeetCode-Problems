class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int [][] sum=new int[mat.length][2];
       
        int sum1=0;
        for(int i=0;i<mat.length;i++)
        {
            sum1=0;
            for(int j=0;j<mat[i].length;j++)
            {
                sum1+=mat[i][j];
            }
            sum[i][0]=sum1;
            sum[i][1]=i;
        }
        Arrays.sort(sum, Comparator.comparingInt((int[] row) -> row[0])  
                                            .thenComparingInt(row -> row[1]));  
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sum[i][1];
        }
        
        return result;
    }
}