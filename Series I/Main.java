#include<iostream>
using namespace std;
#include<iomanip>
int main()
{
  int i,n;
  float a=0.5;
  std::cin>>n;
  std::cout<<a<<" ";
  for(i=1;i<n;i++)
  {
    a=a*3;
    std::cout<<fixed<<setprecision(1)<<a<<" ";
  }
  return 0;
}
