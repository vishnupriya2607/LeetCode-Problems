class Solution {
    public String longestNiceSubstring(String s) {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                String cu=s.substring(i,j+1);
                if(isnice(cu))
                {
                  if(result.length()<cu.length())
                  result=cu;
                }
            }
        }
        return result;
    }
        public static boolean isnice(String s)
        {
            int []arr=new int[58];
            for(int i=0;i<s.length();i++)
            {
                arr[s.charAt(i)-'A']++;
            }
            for(int i=0;i<26;i++)
            {
                if(arr[i]!=0 && arr[i+32]==0 || arr[i]==0  && arr[i+32]!=0)
                return false;
            }
            return true;
        }
    
}