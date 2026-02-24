import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Question3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int NumIn = 1;
		int Position = 0;
		int MaxValue = 0;
		int i = 0;
		
		System.out.println("How many integers will you be inputting ?");
		NumIn = input.nextInt();
		int A[] = new int[NumIn];

		System.out.println("Start typing the values, only integers please. ");
		Getting(Position,NumIn,A,input);
	
		Max(MaxValue,Position,i);
		System.out.println("The max value is : " + MaxValue);
	}
	public static void Getting(int Position,int NumIn, int[] A, Scanner input){
				if (Position <= NumIn){
					A[Position] = input.nextInt();
					Position++;
					Getting();
				}

				else {
					System.out.println("Something went wrong in function Getting");
				}
		}
		
	public static void Max(int i, int MaxxValue,int[]A)
		{
			if(MaxValue<= A[i]){
				MaxValue = A[i];
				i++;
				Max();
			}

			else if(MaxValue > A[i])
			{
				i++;
				Max();
			}
				
			else if(Position == i)
			{
				return MaxValue;
			}
			
			else 
			{
				System.out.println("There was something wrong in the function Max()");
			}
		}
	}
}


