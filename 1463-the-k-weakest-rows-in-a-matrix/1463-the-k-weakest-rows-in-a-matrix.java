class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int c=0;
        int k1[]=new int[k];
        for(int i=0;i<mat.length;i++)
        {
            c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            mat[i][0]=c;
            mat[i][1]=i;
        }
       for (int i = 0; i < mat.length - 1; i++) {
            for (int j = 0; j < mat.length - i - 1; j++) {
                if (mat[j][0] > mat[j + 1][0]) {
               
                    int[] temp = mat[j];
                    mat[j] = mat[j + 1];
                    mat[j + 1] = temp;
                }
            }
        }
        int[] kWeakestRows = new int[k];
        for (int i = 0; i < k; i++) {
            kWeakestRows[i] = mat[i][1]; 
        }

        return kWeakestRows;
    }
}