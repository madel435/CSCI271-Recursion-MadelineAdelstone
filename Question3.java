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
		Getting(Position, NumIn, A, input);
	    Position = NumIn;
		MaxValue = Max(i,MaxValue,Position,A);
		System.out.println("The max value is : " + MaxValue);

		input.close();
	}
	
	public static void Getting(int Position,int NumIn, int[] A, Scanner input){
				if(Position < 0 )
				{ 
				    System.out.println("Something went wrong in function Getting");
	            }
	            
				else if(Position < NumIn){
					A[Position] = input.nextInt();
					
					Getting(Position+1, NumIn,A, input);
				}

				else {
				    return;
				}
		}
		
	public static int Max(int i, int MaxValue,int Position, int[]A)
		{
			if(Position == i)
			{
				return MaxValue;
			}
			else if(MaxValue<= A[i]){
				MaxValue = A[i];
				return Max(i+1,MaxValue,Position,A );
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


