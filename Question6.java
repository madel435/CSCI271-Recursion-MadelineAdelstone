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
* <MAdeline Adelstone
* <Student's WID>
************************************************************************/
import java.util.Scanner; //scanner

public class Question6{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //scanner for input

        int NumIn = 0; //sets the array 
        int SumValue = 0; //total sum
        int Position = 0; //position for getting
	int count = 0;//count for the sumeven increments

        System.out.println("How many integers will you be inputting ?"); //asking how many integers

        NumIn = input.nextInt(); //gets the Num In ans sets the array

        int A[] = new int[NumIn]; //Creating the array and allocating space
		
        System.out.println("Start typing the values, only integers please. "); //asking for integers 
		
        Getting(Position,NumIn,A,input); //calling getting 
        sumEven(count,NumIn,SumValue,A);//calling sum even 
		
		input.close(); //closes scanner
    }
        
    public static void Getting(int Position, int NumIn, int[] A, Scanner input)
    {
         if(Position < NumIn)// if position is less than numin 
		{ 
            A[Position] = input.nextInt(); //Adds to the array adds to the currenct pisiont 
            Position++;//Position increases 
	    Getting(Position,NumIn,A,input);//calling function agian 
        }
		else if ((Position < 0) || (Position > NumIn)) // prints error
        {
            System.out.println("Something went wrong in function Getting"); //error prints 
        }
}
		
    public static void sumEven(int count,int NumIn, int SumValue, int[]A )
    {
        if (count >= 0 && count < NumIn )// if count is greater than o and less than NumIn 
        {
           if (count == 0 && A[count] % 2 == 0) //if count is equal to zero and even then  runn
            {
                SumValue += A[count]; // adds the value at count position to sumvalue 
                count++; //increase count 
                sumEven(count, NumIn,SumValue,A); //calls function 
            }
            else if( A[count] % 2 == 0) //If the value of at count poition is even then run 
            {
                SumValue += A[count]; //Adds the value at count position to SumValue 
                count++;//Increases count
                sumEven(count, NumIn,SumValue,A); //Calls function
            }
           else if( A[count] % 2 == 1) //If the value of at count poition is even then run 
            {
                count++;//Increases count
                sumEven(count, NumIn,SumValue,A); //Calls function
            }
            else 
            {
                count++; //Increases count
                sumEven(count,NumIn,SumValue,A); //Calls function
                System.out.println("Sum is: " + SumValue);//prints the sumvalue
            }
        }
        else if (count < 0 || count > NumIn )
        {
            System.out.println("Something went wrong in sumEven function");//Printing error 
        }    
    }
}
