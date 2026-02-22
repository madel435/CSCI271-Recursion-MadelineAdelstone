

import java.util.Scanner;

public class Question2{
	public static void main(String[] args)
		{
			int Control = 1 ;
			int count = 0 ;
			int CharIn = 1;
			char UserLet = ' ';
			int UserWLeng = 1;
			String UserWord = " ";

			if (Control == 1 )
			{

				Scanner input = new Scanner(System.in);

				System.out.println("What is your word? ");
				UserWord = input.next();

				System.out.println("What is your letter? ");
				UserLet = input.next().charAt(0);

			}

			else if (Control == UserWLeng) {
				{
				UserWLeng = UserWord.length() - 1;
				if (Control == UserWLeng)
				{
				 	CharIn++;
					count = 0;
					System.out.println("The letter " + UserLet + "shows up in the word " + UserWord + count +"times");

				}

				else if (UserLet != UserWord.charAt(count))
				{
					//break;
				}

				else if (UserLet == UserWord.charAt(count))
				{
					CharIn++;
					count++;
				}

				else
				{
					System.out.println("Something went wrong please try again");
				}
			}



	}
}
