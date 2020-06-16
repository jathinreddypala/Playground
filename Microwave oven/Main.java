#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float h,h1;
  std::cin>>n>>h;
  if(n==2)
  {
    h1=h+h/2;
     std::cout<<h1;
  }
  if(n==3)
  {
    h1=2*h;
     std::cout<<h1;
  }
  if(n>3)
    std::cout<<"Number of items is more";
}