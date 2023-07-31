#include <iostream>
using namespace std;

int main()
{
    string s;
    char charCount;

    cout << "Enter a string: ";
    getline (cin, s);

    cout<<"Enter the character to count: ";
    cin>>charCount;

    int count = 0;

    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == charCount)
        {
            count++;
        }
    }

    cout << "The character '" << charCount << "' occurs " << count << " times in the string." << endl;
}
