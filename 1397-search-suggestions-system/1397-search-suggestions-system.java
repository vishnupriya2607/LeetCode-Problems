class Solution {
    public List<List<String>> suggestedProducts(String[] products, String s) {
        Arrays.sort(products);
        List<List<String>> li=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {

            str.append(s.charAt(i));
            li.add(send(products,str));      
              }
       // List<List<String>> li=new ArrayList<>();
        return li;
    }
    public static List<String> send(String []p,StringBuilder s)
    {
        List<String> li=new ArrayList<>();
        int c=0;
        for(int i=0;i<p.length;i++)
        {
            if(p[i].startsWith(s.toString()))
            {
                li.add(p[i]);
                c++;
            }
            if(c==3)
            return li;
        }
        return li;
    }
}