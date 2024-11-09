class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int c=0;
        sol d=new sol(n+1);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    d.union(i, j);
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(d.find(i)==i)
            {
                c++;
            }
        }
        return c;
       
    }
}
class sol
{
     static int []parent;
    public sol(int n)
    {
         parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    
    }
    public int find(int k)
    {
        if(k==parent[k])return k;
         return find(parent[k]);
    }
    public boolean union(int s,int d)
    {
        int x=find(s);
        int y=find(d);
        if(x==y)return false;
        parent[y]=x;
        return true;
    }
}
