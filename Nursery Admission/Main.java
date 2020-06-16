#include<iostream>

#include<string.h>

using namespace std;

int main ()

{

string str;

int len;

getline(cin,str);

len = str.length();

cout << "The number of letters in the name is " << len;

return 0;

}