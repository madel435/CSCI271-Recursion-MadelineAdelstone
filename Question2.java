/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author:Madeline Adelstone
* OS: Windows 11
* Compiler: javac 25.0.1
* Date:Feburary 24,2026
*
* Purpose
*Write a JAVA program that reads a string S and a single character C from the user and displays
*the number of times C occurs in S. This program will use a function that takes S and C as
*arguments and returns the number of times C appears in S recursively! Solutions to this question
*which use a loop are not acceptable! In addition, calculate the running time of this function and
*show your work in details.
*
*************************************************************************/

import java.util.Scanner;

public class Question2{
	public static void main(String[] args)
		{
			int Control = 1 ;
			int count = 0 ;
			int CharIn = 1;
			char UserLet = ' ';
			int UserWLeng = 1;
			String UserWord = " ";

			if (Control == 1 )
			{

				Scanner input = new Scanner(System.in);

				System.out.println("What is your word? ");
				UserWord = input.next();

				System.out.println("What is your letter? ");
				UserLet = input.next().charAt(0);

			}

			else if (Control == UserWLeng) {
				{
				UserWLeng = UserWord.length() - 1;
				if (Control == UserWLeng)
				{
				 	CharIn++;
					count = 0;
					System.out.println("The letter " + UserLet + "shows up in the word " + UserWord + count +"times");

				}

				else if (UserLet != UserWord.charAt(count))
				{
					//break;
				}

				else if (UserLet == UserWord.charAt(count))
				{
					CharIn++;
					count++;
				}

				else
				{
					System.out.println("Something went wrong please try again");
				}
			}



	}
}
