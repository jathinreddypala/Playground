#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,a,c,t;
  std::cin>>b>>a>>c;
  t=(a*75)+(c*30);
  if(b>t)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}