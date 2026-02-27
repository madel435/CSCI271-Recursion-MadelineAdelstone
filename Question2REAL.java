
import java.util.Scanner;

public class Question2
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);

		int count = 0 ;
        int sameLet = 0;
       
		char C = ' ';
		String S = " ";

		System.out.println("What is your word? ");
		S = input.next();

		System.out.println("What is your letter? ");
		C = input.next().charAt(0);

        SinC(C,S,sameLet,count);

		input.close();
    }
    
    public static void SinC(char C, String S,int sameLet,int count)
    {
        if (count <= S.length()- 1)
        {
            if (C == S.charAt(count)) 
            {
                sameLet++;
                count++;
                System.out.println("The letter " + C + " shows up in the word " + S + " " + sameLet +" times");
                SinC(C,S,sameLet,count);
            }

            else if (C != S.charAt(count))
            {
                count++;
                SinC(C,S,sameLet,count);
            }
        }

        else if (count > S.length())
        {
            System.out.println("Something went wrong please try again");
        }
    }
}