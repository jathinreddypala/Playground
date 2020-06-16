#include<iostream>
int main()
{
  // Type your code here
  int n,key;
  bool b;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>key;
   for(int i=0;i<n;i++)
  {
    if(a[i]==key){
      b=true;
      break;
    }
    else
      b=false;
  }
  if(b)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
  
}