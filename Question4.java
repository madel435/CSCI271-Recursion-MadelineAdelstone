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
                
		Scanner input = new Scanner(System.in);
                int Count = 0;
		long N = 1;
		long D = 1;

		int NumLeng = 0;
                int ShareValue = 0;
                int[] A = new int[NumIn];


                System.out.println("Type your number now, please only one large whole number");
                N = input.nextInt();

                System.out.println("Start typing the value to check, only a number from 0-9 please. ");
		
		int GetNum(D,NLeng){
			D = input.nextInt();
			NLeng = N.length + 1;
			GetNum(D,NLeng);
		}

		int Number[] = new int[NLeng];
		
		int Number[] = N;


		if (Chars.contains(Number,D))
		{
			Count++;
		}


                System.out.println("N = " + N);
                System.out.println("D = " + D);
                System.out.println("D appears in N " + Count + "times");




		

        }
}









