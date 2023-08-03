#include <iostream>
using namespace std;

int main() 
{
    int a_len = 0;
    cout << "Enter length of array: ";
    cin >> a_len;

    int a[a_len];
    cout << "Enter element of the array: ";
    for (int i = 0; i < a_len; i++) 
    {
        cin >> a[i];
    }

    bool found = false;

    for (int i = 0; i < a_len; i++) 
    {
        int sum = 0;
        for (int j = i; j < a_len; j++) 
        {
            sum = sum + a[j];
            if (sum == 0) 
            {
                found = true;
                cout << "True" << endl;
                cout << "There is a sub-array with zero sum from index " << i << " to " << j << "." << endl;
                break;
            }
        }
        if (found) 
        {
            break;
        }
    }

    if (!found) 
    {
        cout << "False" << endl;
        cout << "No sub-array with zero sum found." << endl;
    }
}
