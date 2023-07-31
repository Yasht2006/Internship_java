#include <iostream>
using namespace std;

int main()
{
    int n, count;

    cout << "Enter a number: ";
    cin >> n;

    cout << "Prime numbers between 1 to " << n << " are: " << endl;
    for (int i = 1; i <= n; i++)
    {
        count = 0;
        for (int j = 2; j <= i / 2; j++)
        {
            if (i % j == 0)
            {
                count++;
                break;
            }
        }
        if (count == 0)
        {
            cout << i << endl;
        }
    }
}
