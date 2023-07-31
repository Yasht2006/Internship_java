#include <iostream>
#include <string>
using namespace std;
int main() 
{
  string str1,str2;
  cout << "Enter a string: ";
  cin >> str1;
  
  char ch,nextCh;
  
  for (int i=0; i < str1.length(); i++) 
  {
     ch = str1[i];
     nextCh = ch + 1;
     str2 = str2 + nextCh;
  }
  cout << "The next character string is: "<< str2 << endl;;
};
}} 
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
