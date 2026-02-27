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
*
*************************************************************************/


import java.util.Scanner; 

public class Question1{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		String SInput = "";
		int SInt = 0 ;
		int strOutput = 0 ;

		System.out.println("Enter your string: ");

		SInput = Input.nextLine();

		SInt = SInput.length() - 1;
		System.out.println(SInput.length());

		int[] array = new int[SInt + 1];



		if (array[SInt] == 0  )
		{
			strOutput = 1;
			System.out.println("Number of Chaacters: " + strOutput);

		}

		else if ( array[SInt] > 0)
		{
			++strOutput;
			System.out.println("Number of Characters: " + strOutput);

		}

		else 		{
			System.out.println("Number of Characters: " + strOutput);
		}
		Input.close();
	}
}
