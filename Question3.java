import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

//Need something to break it to the start

public class Question3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int NumIn = 1;
		int Position = 0;
		int MaxValue = 0;

		System.out.println("How many integers will you be inputting ?");

		NumIn = input.nextInt();


		int A[] = new int[NumIn];

		System.out.println("Start typing the values, only integers please. ");
		
		void Getting(Position,A[]){
			if (Position <= NumIn){
			A[Position] = input.nextInt();
			Position++;
			Getting();
		}
			else {
			System.out.println("Something went wrong in function Getting");
			}
}
		
int Max(){

}



MaxValue = Arrays.stream(A).max().getAsInt();

		System.out.println("The max value is : " + MaxValue);
	}
}
