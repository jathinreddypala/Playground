#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy;
  std::cin>>by>>cy;
  if(by>cy)
  {
    int x=1900+by;
    int y=2000+cy;
    std::cout<<y-x;
  }
  else
  {
    int x=2000+by;
    int y=2000+cy;
    std::cout<<y-x;
  }
}