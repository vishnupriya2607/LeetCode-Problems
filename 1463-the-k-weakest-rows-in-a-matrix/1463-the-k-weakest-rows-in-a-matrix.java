class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
       
        int sum1=0;
        for(int i=0;i<mat.length;i++)
        {
            sum1=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)

                sum1++;
                else
                break;
            }
            map.put(i,sum1);
        }
        int [] k1=new int[k];
        int i=0;
      List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        
        
        sortedEntries.sort(Map.Entry.comparingByValue());
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            if(k>0)
            {
            k1[i++]=entry.getKey();
            k--;
            }
            else
            {
                break;
            }
        }
     
        return  k1;
    }
}