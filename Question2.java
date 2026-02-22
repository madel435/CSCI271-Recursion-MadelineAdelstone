

import java.util.Scanner;

class Question2{
	public static void main(String[] args)
		{
			int Control = 1;

			if (Control == 1 )
			{

				int count = 0;

				Scanner input = new Scanner(System.in);

				System.out.println("What is your word? ");
				String UserWord = input.next();

				System.out.println("What is your letter? ");
				char UserLet = input.nextChar();
			}

			else {
				if (UserWord.length - 1)
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
