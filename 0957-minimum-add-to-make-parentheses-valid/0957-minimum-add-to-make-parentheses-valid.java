class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> stack=new Stack<>();
       int c=0;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='(')
        {
            stack.push(s.charAt(i));
        }
        else
        {
            if(!stack.isEmpty())
            {
                stack.pop();
            }
            else
            {
                c++;
            }
        }
       }
       return c+stack.size();
    }
}