#include <iostream>
using namespace std;

int Repeat_Element(int a1[], int a1_len)
{
    for (int i = 0; i < a1_len - 1; i++)
    {
        for (int j = i + 1; j < a1_len; j++)
        {
            if (a1[i] == a1[j])
            {
                return a1[i];
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

    int re_ele = Repeat_Element(a1, a1_len);

    if (re_ele != 0)
    {
        cout << "First repeating element: " << re_ele << endl;
    }
    else
    {
        cout << "No repeat element in the array." << endl;
    }
}
