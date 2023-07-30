#include <iostream>
#include <string.h>
using namespace std;

int sort(char s[])
{
	int i,j,n,temp;
	n = strlen(s);
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(s[i]>s[j])
			{
				temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
		}
	}
}
int main()
{
	char s1[100],s2[100];
	
	cout<<"Enter first string: ";
	cin>>s1;
	cout<<"Enter second string: ";
	cin>>s2;
	
	sort(s1);
	sort(s2);
	
	if(strcmp(s1,s2)==0)
	{
		cout<<endl<<"True"<<endl;
		cout<<"Given String are anagrams!";
	}
	else
	{
		cout<<endl<<"False"<<endl;
		cout<<"Given String are not anagrams!";
	}
}