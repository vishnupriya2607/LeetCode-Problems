class Solution {
    public boolean isPalindrome(String s) {
        int flag=1;
        s=s.toLowerCase();
List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a>='a'&&a<='z'||a>='0'&&a<='9')
            list.add(a);
        }
       
       for(int i=0;i<list.size();i++)
       {
        if(list.get(i)!=list.get(list.size()-i-1))
        {
            flag=0;
            break;
        }
        
       }
       if(flag==1)
        return true;
        else
        return false;
    }
}