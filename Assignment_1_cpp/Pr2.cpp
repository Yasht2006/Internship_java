#include <iostream>
using namespace std;

int main() 
{
    string s;
    
    cout<<"Enter a string: ";
    getline(cin,s);
    
    int n = s.length();
    bool isPalindrome = true;

    for (int i = 0; i < n / 2; i++) 
    {
        if (s[i] != s[n - i - 1]) 
        {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) 
    {
        cout << "Given String is Palindrome" << endl;
    } 
    else 
    {
        cout << "Given String is Not Palindrome" << endl;
    }
}
