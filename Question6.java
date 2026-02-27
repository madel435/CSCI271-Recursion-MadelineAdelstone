/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: Madeline Adelstone
* OS: Windows 11
* Compiler: javac 25.0.1
* Date: Feburary 24,2026
*
* Purpose
Write a JAVA program that reads a list of integers from the keyboard and stores them into an
*array A, then, the program will return the sum of all even integers in A using a recursive function
*sumEven(). The program will then print the resulting sum to the screen. In doing so, the function
*must be recursive and should not print anything to the screen, the main program will! Solutions
*to this question using a loop are not acceptable! In addition, calculate the running time of this
*function and show your work in details.
*
*************************************************************************/


import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

//Need something to break it to the start

public class Question3{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                int NumIn = 0;
                int SumValue = 0;
                int Position = 0;

                System.out.println("How many integers will you be inputting ?");

                NumIn = input.nextInt();

                int A[] = new int[NumIn];

                System.out.println("Start typing the values, only integers please. ");

                A[Position] = input.nextInt();
                Position++;

                SumValue = Arrays.stream(A).sumEven();

                System.out.println("Sum is  : " + SumValue);
        }
}



