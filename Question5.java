/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Madeline Adelstone
* OS: Windows 11
* Compiler: javac 25.0.1
* Date: February 24, 2026
*
* Purpose
* Write a JAVA program that reads in a string S from the user and displays it backwards. The
*program must use a recursive function that takes S as an argument and returns S' as S but
*backwards. Solutions to this question using a loop are not acceptable! In addition, calculate the
*running time of this function and show your work in details.
*
******************************************************************
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
* <Student's WID>
*************************************************************************/

import java.util.Scanner;

public class Question5{
public static void main(String[] args){
	
		Scanner input = new Scanner(System.in) //SCanner 
		String S = " "; //S the first string
		String S' = " ";//S the second string that is changed
		int SLength = 0; // The length of S 
		int Position = 0;  //The pistion in array 
		
		SLength = S.length(); //the string length 
		
		String[] array = new array[SLength]; // create the array make the space for the length of s
		String[] newarray = new newarray[SLength]; //create the will be edited array make the space for the length of s
		
		System.out.println("What is your string?"); // ask user for string
		
		S = input.next(); //getting string 
		
		array = S.split(''); // splits the S to input into array 
		
		if(Position == 0){ //If it is first position run 
		
			newarray[Position] = array[Slength - 1]; // setting the new array to the old array making sure due to legnth being one less thant the amount of spos
			Position++; //increating pisiton
			System.out.println(newarray[]); // priting the new aarray
		}
		 else {
			newarray[Position] = array[SLength - 1]; // setting the array
			System.out.println(newarray[]); //pringint the array 
			
			int printS(Position,newarray[],array[]); //calling the function again to run 
		}
	}
}


	

