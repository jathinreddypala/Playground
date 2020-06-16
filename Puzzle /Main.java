#include<iostream>
int main()
{
    // Type your code here
  int r,c,i,j;
  std::cin>>r>>c;
  int m[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>m[i][j];
    }
  }

  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      std::cout<<m[j][i]<<" ";
    }
    std::cout<<"\n";
  }
}