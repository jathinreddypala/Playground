#include <iostream>

using namespace std;

int main()
{
    int a=0,b=1,c,n,i;
    std::cin>>n;
    i=2;
    while(i!=n)
    {
        c=a+b;
        a=b;
        b=c;
        i++;
    }
    std::cout<<c;

    return 0;
}
