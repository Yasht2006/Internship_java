#include <iostream>
using namespace std;

int main()
{
	string s;
	char swap;
	
	cout<<"Enter a string: ";
	getline(cin,s);
	cout<<endl<<"Original string is: "<<s<<endl;
	
	int l;
	for(l=0;s[l];l++);
	
	for(int i=0;i<l/2;i++)
	{
		swap = s[i];
		s[i] = s[l-1-i];
		s[l-1-i] = swap;
	}
	cout<<"Reversed string is: "<<s;
}