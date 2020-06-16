#include<iostream>

using namespace std;

int main()

{
    int a[15],n,sum_even=0,sum_odd=0,i;
    cin>>n;
    if(n<=15)
    {
        for(i=0;i<n;i++){
            cin>>a[i];
        }
        for(i=0;i<n;i++){
            if(a[i]%2==0)
                sum_even=sum_even+a[i];
            else
                sum_odd=sum_odd+a[i];
        }
    }
    cout<<"The sum of the even numbers in the array is "<<sum_even<<"\nThe sum of the odd numbers in the array is "<<sum_odd;
    return 0;
}