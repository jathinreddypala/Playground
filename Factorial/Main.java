#include<iostream>
int fact(int a)
{
  if(a==0)
    return 1;
  else
    return a*fact(a-1);
}
int main()
{
  //Type your code here.
  int n,f;
  std::cin>>n;
  f=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<f;
  return 0;
}