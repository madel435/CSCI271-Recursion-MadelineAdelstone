/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author:Madeline Adelstone
* OS: Windows 11
* Compiler: javac 25.0.1
* Date:Feburary 24,2026
*
* Purpose
*Write a JAVA program that reads a list of integers from the user and stores them into an array A,
*then, the program will find the maximum integer in A using a recursive function max ().
*Solutions to this question using a loop are not acceptable !! In addition, calculate the running time
*of this function. Show your work in details.
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
import java.util.Arrays;

public class Question3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //Scanner to input
		int NumIn = 1; //Sets the array size
		int Position = 0; //Incriments through the array with getting
		int MaxValue = 0; //Sets the max value 
		int i = 0; //Incriments through the array with Max
		
		System.out.println("How many integers will you be inputting ?"); //Asking how many inputting
		NumIn = input.nextInt(); //getting the value in 
		int A[] = new int[NumIn]; //Creating the array and allocating

		System.out.println("Start typing the values, only integers please. "); //Asling for the values
		
		Getting(Position, NumIn, A, input); //Sending them to getting function
		
	    Position = 0; //Setting the position zero 
		MaxValue = Max(i,MaxValue,Position,A); //Setting the Max value to max
		System.out.println("The max value is : " + MaxValue); //Pringint out the maxvalue 

		input.close(); //closing the scanner
	}

	/*****************************<Getting>****************************
* Description: a brief description of what the function does.
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
	
	public static void Getting(int Position,int NumIn, int[] A, Scanner input){
				if(Position < 0 )
				{ 
				    System.out.println("Something went wrong in function Getting");
	            }
	            
				else if(Position < NumIn){
					A[Position] = input.nextInt(); // Putting the values into the array 
					
					Getting(Position+1, NumIn,A, input); // calling again
				}
		}
		/*****************************<Max>****************************
* Description: a brief description of what the function does.
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
	public static int Max(int i, int MaxValue,int Position, int[]A) //
		{
			
			if(MaxValue< A[i]){
				MaxValue = A[i];
				return Max(i+1,MaxValue,Position,A );
			}
				
			else if(MaxValue == A[i]) 
			{
				return MaxValue;
			}
			else if(MaxValue > A[i])
			{
				return Max(i+1, MaxValue, Position, A);
			}
				
			else 
			{
				System.out.println("There was something wrong in the function Max()");
				return 1; 
			}
		}
	}




