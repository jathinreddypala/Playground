#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int tn,x,y,n;
  std::cin>>tn>>x>>y>>n;
  float to=tn/6;
  int o1=n/6;
  int o2=n%6;
  float o=((float)o1+(float)o2/10);
  float r=y/o;
  float rr=x/to;
  std::cout<<to<<"\n"<<fixed<<setprecision(1)<<o<<"\n"<<r<<"\n"<<rr;
  if(r>=rr)
    std::cout<<"\nEligible to Win";
  else
    std::cout<<"\nNot Eligible to Win";
}