#include <iostream>
using namespace std;

int main() 
{
    int n; 
    cout<<"Enter the number: ";
    cin>>n;
    int tn, temp, total = 0;

    tn = n;
    while (tn != 0) 
    {
        temp = tn % 10;
        total = total + temp * temp * temp;
        tn /= 10;
    }

    if (total == n)
        cout << n << " is an Armstrong number!" << endl;
    else
        cout << n << " is not an Armstrong number!" << endl;

}
