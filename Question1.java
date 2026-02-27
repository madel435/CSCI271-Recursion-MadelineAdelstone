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
import java.util.Scanner; 

public class Question1{
	public static void main(String[] args)
	{
		Scanner In = new Scanner(System.in);//Scanner to take input

		int strOutput = 0 ;//Number of character in S 

		System.out.printl("Enter your string. "); //Asking user for string 

		String SInput = In.nextLine(); //Asking for next line 

		int SInt = SInput.length(); //String length 

		System.out.println(SInt); //Prints the length of S

		int[] array = new int[SInt]; //cretes new array makes space of length of S
		array[] = SInt; //Puts the length inside 

		StringOutput(array,SInt, strOuput);

	public static void StringOutput(int[]array,int SInt,int strOutput)
		{
		if (array[SInt] == 0  ) //if there is only one character 
		{
			strOutput = 1; //sets number ourput to 1
			System.out.println("Number of Chaacters: " + strOutput); //Prints the number of characters
			StringOutput(array,SInt, strOutput)
		}
		else if ( array[SInt] > 0) //If the is more characters
		{ 
			++strOutput; //increases the number of characters
			System.out.println("Number of Characters: " + strOutput); //Prints the number of characters
			StringOutput(array,SInt, strOuput)
		}

		else 		{
			System.out.println("Number of Characters: " + strOutput); //Prints the number of characters
		}
		In.close();//closes the scanner 
	
