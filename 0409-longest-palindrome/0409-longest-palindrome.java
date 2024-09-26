class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[128];
        int c=0,flag=0;
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'A']++;
        }
        for(int i=0;i<128;i++)
        {
            if(arr[i]%2==0)
            {
                c+=arr[i];
            }
            else if(arr[i]%2==1)
            {
c+=arr[i]-1;
flag=1;
            }
        }
        if(flag==1)
        {
            return c+1;
        }
        else
        {
            return c;
        }
    }
}