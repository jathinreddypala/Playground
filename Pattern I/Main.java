#include<stdio.h>
int main()
{
    int n,i,j,k,s;
    scanf("%d",&s);
    n=4;
    for(i=1;i<=n;i++)
    {
        for(k=1;k<=i;k++)
        {
            printf("%d",s);
            
        }
        s++;
        printf("\n");
        
    }
    s--;
    for(i=n;i>=1;i--)
    {
        for(k=1;k<=i;k++)
        {
            printf("%d",s);
            
        }
        s--;
        printf("\n");
        
    }
    return 0;
}