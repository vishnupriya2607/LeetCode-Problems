class Pair
{
int row;
int col;
Pair(int row,int col)
{
    this.row=row;
    this.col=col;
}
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       
        Queue<Pair> q=new LinkedList<>();
        int [][]vis=new int[m][n];
        //for row
        for(int i=0;i<n;i++)
        {
           if(grid[0][i]==1)
           {
            q.add(new Pair(0,i));
            vis[0][i]=1;
           }
           if(grid[m-1][i]==1)
           {
            q.add(new Pair(m-1,i));
            vis[m-1][i]=1;
           }
        }
            //for col
        for(int i=0;i<m;i++)
        {
           if(grid[i][0]==1)
           {
            q.add(new Pair(i,0));
            vis[i][0]=1;
           }
           if(grid[i][n-1]==1)
           {
            q.add(new Pair(i,n-1));
            vis[i][n-1]=1;
           }
        }
        
        int []drow={-1,0,1,0};
        int []dcol={0,1,0,-1};
        while(!q.isEmpty())
        {
            int r=q.peek().row;
            int c=q.peek().col;
            q.poll();
            for(int i=0;i<4;i++)
            {
             int nrow=r+drow[i];
             int ncol=c+dcol[i];
             if(nrow>=0 && nrow<m && ncol>=0 && ncol<n &&grid[nrow][ncol]==1 && vis[nrow][ncol]==0)
               {
                 vis[nrow][ncol]=1;
                 q.offer(new Pair(nrow,ncol));
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
if(grid[i][j]==1 && vis[i][j]==0)
{
    ans++;
}
            }
        }
        return ans;
    }
}