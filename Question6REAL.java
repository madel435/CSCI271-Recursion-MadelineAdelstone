import java.util.Scanner;

public class Question6{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int NumIn = 0;
        int SumValue = 0;
        int Position = 0;
		int count = 0;

        System.out.println("How many integers will you be inputting ?");

        NumIn = input.nextInt();

        int A[] = new int[NumIn];
		
        System.out.println("Start typing the values, only integers please. ");
		
        Getting(Position,NumIn,A,input);
        sumEven(count,NumIn,SumValue,A);
		
		input.close();
    }
    public static void Getting(int Position, int NumIn, int[] A, Scanner input)
    {
         if(Position < NumIn)
		{ 
            A[Position] = input.nextInt();
            Position++;
			Getting(Position,NumIn,A,input);
        }
		else if ((Position < 0) || (Position > NumIn))
        {
            System.out.println("Something went wrong in function Getting");
        }
	}
		
    public static void sumEven(int count,int NumIn, int SumValue, int[]A )
    {
        if (count >= 0 && count < NumIn )
        {
           if (count == 0 && A[count] % 2 == 0)
            {
                SumValue += A[count];
                count++;
                sumEven(count, NumIn,SumValue,A);
            }
            else if (count == NumIn - 1 )
            {
                SumValue += A[count];
                System.out.println("Sum is: " + SumValue);
            }
        
            else if( A[count] % 2 == 0)
            {
                SumValue += A[count];
                count++;
                sumEven(count, NumIn,SumValue,A);
            }

            else 
            {
                count++;
                sumEven(count,NumIn,SumValue,A);
            }
        }
        else if (count < 0 || count > NumIn )
        {
            System.out.println("Something went wrong in sumEven function");
        }    
    }
}