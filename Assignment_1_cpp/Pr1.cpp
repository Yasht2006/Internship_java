#include <iostream>
using namespace std;

int main() 
{
    int n;
   
    cout << "Enter an integer: ";
    cin >> n;
    
    if (n % 2 == 1) 
    {
        cout << n <<" is Weird" << endl;
    } 
    else if (n % 2 == 0 && n >= 2 && n <= 5) 
    {
        cout <<n << " is Not Weird" << endl;
    } 
    else if (n % 2 == 0 && n >= 6 && n <= 20)
    {
        cout <<n <<" is Weird" << endl;
    } 
    else if (n % 2 == 0 && n > 20) 
    {
        cout <<n << " is Not Weird" << endl;
    }
}
er: ";
    cin >> n;

    PrimeNotPrime(n);
}
