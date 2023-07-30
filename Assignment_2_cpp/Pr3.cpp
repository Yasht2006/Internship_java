#include <iostream>
using namespace std;

void sortArray(int arr[], int arr_len) 
{
    for (int i = 0; i < arr_len - 1; i++) 
    {
        for (int j = 0; j < arr_len - i - 1; j++) 
        {
            if (arr[j] > arr[j + 1]) 
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() 
{
    int a1_len = 0;
    cout << "Enter length of array: ";
    cin >> a1_len;

    int a1[a1_len];
    cout << "Enter elements of the array: ";
    for (int i = 0; i < a1_len; i++) 
    {
        cin >> a1[i];
    }

    sortArray(a1, a1_len);

    int smallele = 1;
    for (int i = 0; i < a1_len; i++) 
    {
        if (a1[i] <= smallele)
            smallele = smallele + a1[i];
        else 
            break;
    }

    cout << "Smallest unrepresented integer element in array: " << smallele << endl;
}