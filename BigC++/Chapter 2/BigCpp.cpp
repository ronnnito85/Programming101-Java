// BigCpp.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <string>
using namespace std;
int main()
{
	/*Exercise P2.12. Write a program that reads a number greater than or equal to 1,000
	from the user and prints it with a comma separating the thousands. */

	int input1=0;
	cin>>input1;
	int tausands=input1/1000;
	int rest=input1 % 1000;
	cout<<tausands<<","<<rest<<endl;

//--------------------------------------------------------------------------------------------------------------

	/*Exercise P2.13. Write a program that reads a number between 1,000 and 999,999
	from the user, where the user enters a comma in the input. Then print the number
	without a comma.*/

	string number="";
	getline(cin, number);
	char comma=',';
	int count=0;
	for (int i = 0; i < number.length(); i++)
	{
		if (comma==number[i])
		{
			count=i;
		}
	}
	string first=number.substr(0,count);
	string second=number.substr(count+1);
	cout<<first+second<<endl;

//---------------------------------------------------------------------------------------------------------------

	/*Exercise P2.14.Printing a grid. Write a program that prints the following grid to play tic-tac-toe.
        +--+--+--+
        |  |  |  |
        +--+--+--+
        |  |  |  |
		+--+--+--+
		|  |  |  |
		+--+--+--+  */

	 string plus="+",minus="--", vertical="|";
	 size_t size=4;
	 
	 for (int i = 0; i < size; i++)
	 {	 
		 for (int i = 0; i < size-1; i++)
		 {
			 cout<<plus<<minus;
		 
		 }
		 cout<<plus<<endl;

		 for (int i = 0; i < size; i++)
		 {
			 cout<<vertical<<"  ";
		 }cout<<endl;
	 }
	for (int i = 0; i < size-1; i++)
	{
		cout<<plus<<minus;
		 
	}cout<<plus<<endl;
	cout<<endl;

//--------------------------------------------------------------------------------------------------------------------

	/*Exercise P2.15. Write a program that reads in an integer and breaks it into a sequence
	of individual digits. For example, the input 16384 is displayed as 1 6 3 8 4
	You may assume that the input has no more than five digits and is not negative.*/

	string number="";
	cin>>number;
	for (size_t i = 0; i < number.length(); i++)
	{
		cout<<number[i]<<" ";
	}
	cout<<endl;
//--------------------------------------------------------------------------------------------------------------------

//	Exercise P2.19. Write a program that transforms numbers 1, 2, 3, …, 12 into the corresponding
//month names January, February, March, …, December. Hint: Make a very
//long string "January February March ...", in which you add spaces such that each
//month name has the same length. Then use substr to extract the month you want. ....No way!!!
	
	int month=0;
	cin>>month;
	switch (month)
	{
	case 1:
		cout<<"January"<<endl;
		break;
	case 2:
		cout<<"February"<<endl;
		break;
	case 3:
		cout<<"March"<<endl;
		break;
	case 4:
		cout<<"April"<<endl;
		break;
	case 5:
		cout<<"May"<<endl;
		break;
	case 6:
		cout<<"June"<<endl;
		break;
	case 7:
		cout<<"July"<<endl;
		break;
	case 8:
		cout<<"August"<<endl;
		break;
	case 9:
		cout<<"September"<<endl;
		break;
	case 10:
		cout<<"October"<<endl;
		break;
	case 11:
		cout<<"November"<<endl;
		break;
	case 12:
		cout<<"December"<<endl;
		break;
	default:
		cout<<"Wrong choice"<<endl;
		break;
	}



	return 0;
}

