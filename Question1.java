import java.util.Scanner; 

public class Question1{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		string SInput = "";
		int SInt = 0 ;
		int strOutput = 0 ;
		int SInput = 0;

		System.out.println("Enter your string. ");

		SInput = Input;

		SInt = parseInt(SInput);
		System.out.println(SInput.length());

		int[] array = new Int[SInt];

		if (array[0] )
		{
			strOutput = 1;
			System.out.println("Number of Chaacters: " + strOutput);

		}

		else if ( array[SInt] > 0)
		{
			++strOutput;
			System.out.println("Number of Characters: " + strOutput);

		}

		else if (array[SInt - 1])
		{
			System.out.println("Number of Characters: " + strOutput);
		}

		else
		{
			System.out.println("Something went wrong, please try again");
		}
	}
}
