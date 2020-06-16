#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fc,sa,sd,sc,aa,ad,ac,fda,fta,sda,sta,ada,ata;
  std::cin>>fa>>fd>>fc>>sa>>sd>>sc>>aa>>ad>>ac;
  fda=fa*fd/100;
  sda=sa*sd/100;
  ada=aa*ad/100;
  fta=fa-fda+fc;
  sta=sa-sda+sc;
  ata=aa-ada+ac;
  std::cout<<"In Flipkart Rs."<<fta<<"\nIn Snapdeal Rs."<<sta<<"\nIn Amazon Rs."<<ata;
  if(fta<=sta&&fta<=ata)
    std::cout<<"\nHe will prefer Flipkart";
  else if(sta<ata)
    std::cout<<"\nHe will prefer Snapdeal";
  else
    std::cout<<"\nHe will prefer Amazon";
}