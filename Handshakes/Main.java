#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  std::cin>>n;
  for(int i=1;i<n;i++)
  {
    sum=sum+i;
  }
  std::cout<<sum;
}