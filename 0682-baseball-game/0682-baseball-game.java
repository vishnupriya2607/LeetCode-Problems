class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> li=new Stack<>();
        for(String s:operations)
        {
            if(s.equals("C"))
            {
li.pop();
            }
            else if(s.equals("D"))
            {
                li.push(li.peek()*2);
            }
            else if(s.equals("+"))
            {
                int a=li.pop();
                int b=li.peek();
                li.push(a);
                li.push(a+b);
            }
            else
            {
                li.push(Integer.parseInt(s));
            }
        }
       int sum = 0;
        for (int score : li) {
            sum += score;
        }

        return sum;
    
    }
}