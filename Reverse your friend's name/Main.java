#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  std::string str;
  std::getline(cin,str);
  for(std::string::reverse_iterator
      i=str.rbegin();i<str.rend();i++)
  {
    std::cout<<*i;
  }
}