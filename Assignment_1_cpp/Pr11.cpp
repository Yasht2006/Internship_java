#include <iostream>
#include <string>
using namespace std;

int countUniqueChar(const string& str) 
{
    bool charSet[128] = {false}; 
    int uniqueChar = 0;

    for (char ch : str) 
    {
        if (isalpha(ch) && !charSet[ch]) 
        {
            charSet[ch] = true;
            uniqueChar++;
        }
    }
    return uniqueChar;
}

int main() 
{
    string s1,s2;
    cout << "Enter first string: ";
    getline(cin, s1);

    cout << "Enter second string: ";
    getline(cin, s2);

    string concateStr = s1 + s2;

    int uniqueCharCount = countUniqueChar(concateStr);

    cout << "Total number of unique characters of the two strings are: " << uniqueCharCount << endl;
}
