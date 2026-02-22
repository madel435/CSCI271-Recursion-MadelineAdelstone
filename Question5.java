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








