#include<iostream>
int main()
{
  int n,a,i;
  std::cin>>n;
  a=6;
  std::cout<<a<<" ";
  for(i=1;i<n;i++)
  {
    a=a+(5*i);
    std::cout<<a<<" ";
  }
  return 0;
}