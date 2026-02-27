import java.util.Scanner; 

public class Question1{
	public static void main(String[] args)
	{
		Scanner In = new Scanner(System.in);

		int strOutput = 0 ;

		System.out.printl("Enter your string. ");

		String SInput = In.nextLine();


		int SInt = SInput.length();

		System.out.println(SInt);

		int[] array = new int[SInt];
		array[] = SInt;
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

		else 		{
			System.out.println("Number of Characters: " + strOutput);
		}
		In.close();
	}
}
