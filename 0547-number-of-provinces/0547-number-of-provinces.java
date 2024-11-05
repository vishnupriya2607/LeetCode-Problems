class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        int n=isConnected[0].length;
        List<List<Integer>> adj=new ArrayList<>();
        int vis[]=new int[m];
        for(int i=0;i<m;i++)
        {
            adj.add(new ArrayList());
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)continue;
                if(isConnected[i][j]==1)
                {
                    adj.get(i).add(j);
                }
            }
        }
        
        int c=0;
        for(int i=0;i<m;i++)
        {
            if(vis[i]!=1)
            {
                c++;
                dfs(i,adj,vis);
            }
        }
        return c;
    }
    public static void dfs(int node,List<List<Integer>> adj,int []vis)
    {
        vis[node]=1;
        for(int i:adj.get(node))
        {
            if(vis[i]!=1)
            {
            dfs(i,adj,vis);
            }

        }
    }

}