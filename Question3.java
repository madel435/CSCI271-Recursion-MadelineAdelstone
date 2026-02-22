import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Question3{
	public static void main(Strings[] args){
		Scanner input = new Scanner(System.in);
		int NumIn = 1;
		int Position = 0;
		int MaxValue = 0;


		System.out.println("How many integers will you be inputting ?");

		NumIn = input.nextInt();

		int A[] = new int[NumIn];

		System.out.println("Start typing the values, only integers please. ");

		int A[Position] = input.nextInt();
		Position++;

		MaxValue = Arrays.asList().max();

		System.out.println("The max value is : " + MaxValue);
	}
}
