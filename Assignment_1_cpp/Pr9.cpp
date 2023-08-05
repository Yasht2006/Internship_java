#include <iostream>
#include <ctime>
using namespace std;

int main() {
    int day, month, year;
    cout << "Enter day, month, and year separated by spaces: ";
    cin >> day >> month >> year;

    tm date = {0};
    date.tm_mday = day;
    date.tm_mon = month - 1; 
    date.tm_year = year - 1900; 

    mktime(&date);

    int localDay = date.tm_mday;
    int localMonth = date.tm_mon + 1; 
    int localYear = date.tm_year + 1900; 

    cout << "Converted into localDate: " << localDay << "/" << localMonth << "/" << localYear <<endl;   
}