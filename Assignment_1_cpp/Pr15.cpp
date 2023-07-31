#include <iostream>
using namespace std;

void sort(string& str) 
{
    for (int i = 0; i < str.length() - 1; i++) 
    {
        for (int j = i + 1; j < str.length(); j++) 
        {
            if (str[i] > str[j]) 
            {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
    }
}

int main() 
{
    string s;
    cout << "Enter a string: ";
    getline(cin,s);

    sort(s);

    cout << "\nSorted string: " << s;
}
