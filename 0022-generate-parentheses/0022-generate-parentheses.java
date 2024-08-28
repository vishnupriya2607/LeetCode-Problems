class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<String>();
        gernerate(list,"",0,0,n);
        return list;
    }
    public void gernerate(List<String> list,String str,int o,int c,int n)
    {
        if(str.length()==(2*n))
        {
            list.add(str);
            return;
        }
        if(o<n)
        gernerate(list,str+"(",o+1,c,n);
        if(c<o)
        gernerate(list,str+")",o,c+1,n);



    }
}