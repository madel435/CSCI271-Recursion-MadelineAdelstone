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
********************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Madeline Adelstone 
*************************************************************************/

import java.util.Scanner;

public class Question2
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);//Scanner to recieive input

		int count = 0 ; //incrimentor 
        int sameLet = 0; //Checks how many times the letter matches
       
		char C = ' '; //Char that it is checked against
		String S = " ";//String that is checked

		System.out.println("What is your word? "); //Asking user for word
		S = input.next();//Getting word

		System.out.println("What is your letter? ");//Askinf for letter
		C = input.next().charAt(0);' //Getting letter

        SinC(C,S,sameLet,count); //Calling function of S in C

		input.close(); //closing scanner
    }

	
    public static void SinC(char C, String S,int sameLet,int count) 
    {
        if (count <= S.length()) //if count is less than the lenght of s 
        {
            if (C == S.charAt(count))  //Checking if C matches the letter in the count position if so continue
            {
                sameLet++; //inreases the same letter 
                count++; //increases the count
                System.out.println("The letter " + C + " shows up in the word " + S + " " + sameLet +" times"); //prints the outcome
                SinC(C,S,sameLet,count);//calls again
            }

            else if (C != S.charAt(count)) //C does not match the S letter at c position if it does not tgen 
            {
                count++; //Just increase count
                SinC(C,S,sameLet,count); //calls again 
            }
        }

        else if (count > S.length()) // if the count is greater than S something went wrong 
        {
            System.out.println("Something went wrong please try again");
        }
    }
}
