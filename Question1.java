import java.util.Scanner; 

public class Question1{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);

		String SInput = "";
		int SInt = 0 ;
		int strOutput = 0 ;

		System.out.println("Enter your string. ");

		SInput = Input.nextLine();

		parseInt(SInput);
		System.out.println(SInput.length());

		int[] array = new int[SInt];

		if (array[SInt] == 0  )
		{
			strOutput = 1;
			System.out.println("Number of Chaacters: " + strOutput);

		}

		else if ( array[SInt] > 0)
		{
			++strOutput;
			System.out.println("Number of Characters: " + strOutput);

		}

		else if (array[SInt]-1)
		{
			System.out.println("Number of Characters: " + strOutput);
		}

		else
		{
			System.out.println("Something went wrong, please try again");
		}
	}
}
