int repeatedStringMatch(char* a, char* b) {
    int l1=strlen(a);
    int l2=strlen(b);
    int c=l1;
    int k=1;
    while(c<l2)
    {
c=c+l1;
k++;
    }
    char temp[2*l1+l2+1];
    temp[0]='\0';
    for(int i=0;i<k;i++)
    {
        strcat(temp,a);
    }
    if(strstr(temp,b)!=NULL)
    return k;
    strcat(temp,a);
    k++;
    if(strstr(temp,b)!=NULL)
    return k;
    return -1;

}