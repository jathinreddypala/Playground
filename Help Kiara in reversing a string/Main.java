#include <iostream>
#include<cstring>
int main()
{
char str[100], rev[100],temp;     
int count = 0, end, i;    
//Your code goes here
  std::cin.getline(str,100);
  end=strlen(str)-1;
  for(i=0;i<end;i++,end--)
  {
    temp = str[i];

       str[i] = str[end];

       str[end] = temp;
  }
  strcpy(rev,str);
std::cout<<rev;
}