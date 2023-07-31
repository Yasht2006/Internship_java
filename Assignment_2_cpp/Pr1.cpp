#include <iostream>
using namespace std;

int main() 
{
    int a1_len = 0, a2_len = 0, a3_len = 0;
    cout << "Enter length of first array: ";
    cin >> a1_len;
    int a1[a1_len];
    cout << "Enter elements of first array in sequence: ";
    for (int i = 0; i < a1_len; i++)
    {
        cin >> a1[i];
    }

    cout << "Enter length of second array: ";
    cin >> a2_len;
    int a2[a2_len];
    cout << "Enter elements of second array in sequence: ";
    for (int i = 0; i < a2_len; i++)
    {
        cin >> a2[i];
    }

    cout << "Enter length of third array: ";
    cin >> a3_len;
    int a3[a3_len];
    cout << "Enter elements of third array in sequence: ";
    for (int i = 0; i < a3_len; i++)
    {
        cin >> a3[i];
    }

    int i = 0, j = 0, k = 0;
    cout << "Common elements are: ";

    while (i < a1_len && j < a2_len && k < a3_len) 
    {
        if (a1[i] == a2[j] && a2[j] == a3[k]) 
        {
            cout << a1[i] << " ";
            i++;
            j++;
            k++;
        }
        else if (a1[i] < a2[j])
        {
            i++;
        }
        else if (a2[j] < a3[k]) 
        {
            j++;
        }            
        else 
        {
            k++;
        }
    }
}
