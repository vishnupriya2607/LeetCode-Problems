#include<limits.h>
int reverse(int x){
    
int a=x;
 long int sum=0;
while(a!=0)
{
    int rem=a%10;
    //printf("%d",rem);
     sum=rem+sum*10;
    a/=10;
}

if(sum> -2147483648 &&sum< 2147483647)
return sum;
else
        return 0;

}