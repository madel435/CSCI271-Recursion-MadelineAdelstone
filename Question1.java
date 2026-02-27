/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author:Madeline Adelstone
* OS: Windows 11
* Compiler: javac 25.0.1
* Date:Feburary 24,2026
*
* Purpose
* Write a JAVA program that reads in a string S from the user and displays the length of S. In doing
*so, the program will use a recursive function that takes S as an argument and returns the number
*of characters in S recursively! Solutions to this question using a loop are not acceptable! In
*addition, calculate the running time of this function and show your work in details.
*******************************************************************
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
public class Question1
	{
		public static void main(String[] args)
		{
			Scanner Input = new Scanner(System.in); //Scanner to take input
	
			String S = ""; //String S take from user
			int SInt = 0 ; //Put the length here for array
			int strOutput = 0 ; // Actual number of character
			System.out.println("Enter your string. "); //Asking user for string
	
			S = Input.nextLine(); //Taking from user 
	
			SInt = S.length() - 1; //Array start from 0 so must decrease length with 1 
			System.out.println(S.length()); //Printing out the length inputted
	
			int[] array = new int[SInt + 1]; //Allocating the array space
	
			if (array[SInt] == 0 ) //if the array size is ==0 then run 
			{
				strOutput = 1; //Sets it to one
				System.out.println("Number of Chaacters: " + strOutput); // Outputs the number of characters then one
			
			else if ( array[SInt] > 0) //if it is greater than 0 than run
			{
				++strOutput; //increases the strOutput
				System.out.println("Number of Characters: " + strOutput); // Outputs the number of characters which will be in strOuput
			}	
			else
			{
				System.out.println("There was an issue "); //Error statement 
			}
				
			Input.close();//Closes scanner 
		}
	}
