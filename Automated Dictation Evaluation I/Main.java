#include<iostream>

#include<string>


using namespace std;

int main ()

{

string str1, str2;

getline(cin,str1);

getline(cin,str2);

if(str1.compare(str2)==0)

cout << "It is correct";

else
cout << "It is wrong";
return 0;

}
