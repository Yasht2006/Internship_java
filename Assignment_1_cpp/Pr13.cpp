#include <iostream>
using namespace std;

bool isWhitespace(char ch) 
{
    return ch == ' ' || ch == '\t' || ch == '\n';
}

string findLargestWord(const string& s) 
{
    string largeWord;
    string curWord;

    for (char ch : s) 
    {
        if (isWhitespace(ch)) 
        {
            if (curWord.length() > largeWord.length()) 
            {
                largeWord = curWord;
            }
            curWord.clear();
        } 
        else 
        {
            curWord += ch;
        }
    }

    if (curWord.length() > largeWord.length()) 
    {
        largeWord = curWord;
    }

    return largeWord;
}

int main() 
{
    string s;
    cout << "Enter a string: ";
    getline(cin, s);

    string largeWord = findLargestWord(s);
    cout << "The largest word in the given string is: " << largeWord << endl;
}
