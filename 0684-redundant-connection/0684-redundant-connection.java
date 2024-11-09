class Solution {
    
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        sol d=new sol(n+1);
        for(int [] a:edges)
        {
            if(!d.union(a[0],a[1]))
            {
                return a;
            }
        }
            return new int[0];
        
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
