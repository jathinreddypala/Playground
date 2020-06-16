#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f;
  std::cin>>a>>b>>c>>d;
  e=a+c;
  f=b+d;
  if(f>100){
    f=f-100;
    e=e+1;
  }
  std::cout<<e<<"\n"<<f;
}