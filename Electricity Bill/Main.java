#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units,a;
  std::cin>>units;
  if(units<=200)
  {
    a=(units*0.5);
    std::cout<<"Rs."<<a;
  }
  else if(units<=400)
  {
    a=(units*0.65)+100;
    std::cout<<"Rs."<<a;
  }
  else if(units<=600)
  {
    a=(units*0.8)+200;
    std::cout<<"Rs."<<a;
  }
  else{
    a=(units*1.25)+425;
    std::cout<<"Rs."<<a;
  }
}