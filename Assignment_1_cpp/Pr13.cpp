#include <iostream>
using namespace std;

bool whitespace(char ch) 
{
    return ch == ' ' || ch == '\t' || ch == '\n';
}

string LargestWord(const string& s) 
{
    string largeWord;
    string curWord;

    for (char ch : s) 
    {
        if (whitespace(ch)) 
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
    
    cout << "The largest word in the given string is: " << LargestWord(s)<< endl;
}
