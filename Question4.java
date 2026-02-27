/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author:Madeline Adelstone
* OS: Windows 11
* Compiler: javac 25.0.1
* Date:Feburary 24,2026
*
* Purpose
*Write a JAVA program that reads in an integer N and a single digit D from the user and displays
*the number of times D occurs in N. The program will use a recursive function that takes N and D
*as arguments and returns the number of times D appears in N recursively! here are few examples:
*
*************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Question3{
        public static void main(String[] args){
                
		Scanner input = new Scanner(System.in);//Scanner for in
			
        int Count = 0; //States the amount D is in N incriments
		long N = 1; //Long number that we are checking if D is in
		long D = 1; //Number that checking if is in N

		int NumLeng = 0; //Getting the length of the number
                int ShareValue = 0; 
                int[] A = new int[NumIn];


                System.out.println("Type your number now, please only one large whole number"); //Asking for the whole bumber
                N = input.next(); //Getting the input
 
                System.out.println("Start typing the value to check, only a number from 0-9 please. "); //Geting the D to check
				D	=	input.next();

		int GetNum(D,NLeng){
			D = input.nextInt();
			NLeng = N.length + 1;
			GetNum(D,NLeng);
		}

		int Number[] = new int[NLeng];// creates array and makes space with the length of n 
		
		int Number[] = N; //Puts in N

		if (Chars.contains(Number,D))  
		{
			Count++;
		}


                System.out.println("N = " + N); //Prints out N
                System.out.println("D = " + D); ?//Prints out D
                System.out.println("D appears in N " + Count + "times"); //Prints out the statement and how many times it is in it 




		

        }
}










