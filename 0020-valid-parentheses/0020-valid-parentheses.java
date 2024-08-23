class Solution {
    public boolean isValid(String s) {
        int c=0;
        if(s.length()%2!=0)
        return false;
        Stack<Character> stack = new Stack<>();
        for(char x:s.toCharArray())
        {
            if(x=='{'||x=='('||x=='[')
            {
                stack.push(x);
                c++;
            }
            if(stack.size()>0)
            {
            if(x==')'&& stack.peek()=='(')
                stack.pop();
            if(x=='}'&& stack.peek()=='{')
                stack.pop();
            if(x==']'&& stack.peek()=='[')
                stack.pop();
            }
            else
              return false;
        }
if(stack.size()==0&&c==s.length()/2)
return true;
else
return false;

    }
}