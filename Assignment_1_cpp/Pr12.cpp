#include <iostream>
#include <string>
using namespace std;

string shiftLetters(const string& s) 
{
    string shiftedStr = s;

    for (char& ch : shiftedStr) 
    {
        if (isalpha(ch)) 
        {
            bool isUpperCase = isupper(ch);

            if (ch == 'z' || ch == 'Z') 
            {
                ch = ch-25;
            } 
            else 
            {
                ch++;
            }

            if (isUpperCase && ch >= 'a' && ch <= 'z') 
            {
                ch = ch-32;
            }
        }
    }

    return shiftedStr;
}

int main() 
{
    string s;
    cout << "Enter a string: ";
    getline(cin, s);

    string res = shiftLetters(s);
    cout << "After shifted character the string is: " << res << endl;
}
