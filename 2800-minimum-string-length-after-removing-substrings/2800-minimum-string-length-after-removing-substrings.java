class Solution {
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty())
            {
                stack.push(s.charAt(i));
               continue;
            }
           
                if(s.charAt(i)=='B' && stack.peek()=='A')
                {
                    stack.pop();
                }
                else if(s.charAt(i)=='D' && stack.peek()=='C')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            
        }
        return stack.size();
    }
}