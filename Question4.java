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
/*******************************************************************
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

public class Question3
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in); //SCanner 

            int sameNum = 0; //If the same increases 
            int Count = 0;//Count incrimentor
            long N = 0;//N as a String long
            long D = 0;//D as a String long
			String NString = " ";//N as a String 
            String DString = " "; //D as a String 

            System.out.println("Type your number now, please only one large whole number. Must be less than 9,223,372,036,854,775,807."); //Asks user for the long N number
            N = input.nextLong();//Gets the N 

            NString = Long.toString(N); //Converts N long to N string

            System.out.println("Start typing the value to check, only a number from 0-9 please. "); //Asks user for the number
            D = input.nextLong();// Takes in the long N number 

            DString = Long.toString(D); //Converst D ling to D string

            valInNum(Count,NString,DString ,sameNum,N,D); //calls Value in Num function

            input.close();//closes scanner

        }
            /*****************************<Function Name>****************************
* Description:This compares the N string and D string to see if the letter in the position is the same if so increases same let
*
* Parameters: int Count,String NString,String DString,int sameNum,long N, long D
*
* Pre: Count must have a value the N and D must be changed to a string there must be a sameNum and it must initalize be set to zero same with count there must be a long N and D
*
* Post: That the all of the num in N will have been checked and the same Num would havev been set and count will be the length og n 
*
* Returns: Returns eiteher an error message or  System.out.println("N = " + N);
            System.out.println("D = " + D);
            System.out.println("D appears in N " + sameNum + " times");

*
* Called by: main,valInNum
* Calls: calls valInNum
************************************************************************/
    public static void valInNum(int Count,String NString,String DString,int sameNum,long N, long D)
    {
        if (Count <= NString.length()-1) // if count is less than the length of N 
        {
            if (DString.charAt(0) == NString.charAt(Count)) //If D string letter is equal to the num of N 
            {
                sameNum++; //samenum increased
                Count++;//count increased 
                valInNum(Count,NString,DString ,sameNum,N,D);
            }

            else if (DString.charAt(0) != NString.charAt(Count))//If D string letter is not equal to the num of N 
            {
                Count++; //Count is increased 
                valInNum(Count,NString,DString ,sameNum,N,D); //function called again
            }
        }

        else if (Count == NString.length()) // if count is equal to the length of the N string then print 
        {
            System.out.println("N = " + N); // Outputs the D N the the same Num
            System.out.println("D = " + D);
            System.out.println("D appears in N " + sameNum + " times");
        }
        else 
        {
            System.out.println("Something went wrong in ValinNUm"); //Error message
        }
    }
}
