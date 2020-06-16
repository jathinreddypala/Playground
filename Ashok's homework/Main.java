#include<iostream>
int main()
{
    // Type your code here
  int r,c;
  std::cin>>r>>c;
  int matrix1[r][c],matrix2[r][c],matrix3[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>matrix1[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>matrix2[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
      std::cout<<matrix3[i][j]<<" ";
    }
     std::cout<<"\n";
  }
  
}