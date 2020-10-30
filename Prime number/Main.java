#include <iostream>
#include <cmath>
#include <iomanip>


using namespace std;

bool isPrime(int);

int main()
{
    int n1;
    cin>>n1;

    if(isPrime(n1))
    {
        printf("%.2f",sqrt((double)n1));
    }
    else
    {
        printf("0.00");
    }
    

    return 0;
}

bool isPrime(int a)
{
    if(a<=1)
    {
        return false;
    }
    for(int i=2;i<=sqrt((double)a);i++)
    {
        if(a%i==0)
        {
            return false;
        }
    }

    return true;
}