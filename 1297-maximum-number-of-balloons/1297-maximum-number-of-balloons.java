class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text.length()<7)
        return 0;
        char []arr={'b','a','l','l','o','o','n'};
        int []a=new int[5];
       for(int i=0;i<text.length();i++)
       {
    if(text.charAt(i)=='b')
    {
        a[0]+=1;
    }
   else if(text.charAt(i)=='a')
    {
        a[1]+=1;
    }
   else if(text.charAt(i)=='l')
    {
        a[2]+=1;
    }
   else if(text.charAt(i)=='o')
    {
        a[3]+=1;
    }
   else if(text.charAt(i)=='n')
    {
        a[4]+=1;
    }
}

a[2]=a[2]/2;
a[3]=a[3]/2;
int min=a[0];
for(int i=0;i<a.length;i++)
{
    System.out.println(a[i]);
    if(min>a[i])
    min=a[i];
}
return min;
    }
}