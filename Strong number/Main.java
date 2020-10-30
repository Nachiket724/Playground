#include <iostream>

using namespace std;

int fact(int);

int main()
{
    int num;
    cin>>num;

    int temp=num;

    int sum=0;

    while(temp>0)
    {
        int n=temp%10;
        sum+=fact(n);
        temp/=10;
    }

    if(sum==num)
    {
        cout<<"Yes";
    }
    else
    {
        cout<<"No";
    }
    

    return 0;
}

int fact(int n)
{
    int num=1;
    if(n<=1)
    {
        return 1;
    }
    for(int i=2;i<=n;i++)
    {
        num*=i;
    }

    return num;
    
}