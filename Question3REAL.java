import java.util.Scanner;

public class Question3
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            int sameNum = 0;
            int Count = 0;
            long N = 0;
            long D = 0;
            String NString = " ";
            String DString = " ";

            System.out.println("Type your number now, please only one large whole number. Must be less than 9,223,372,036,854,775,807.");
            N = input.nextLong();

            NString = Long.toString(N);

            System.out.println("Start typing the value to check, only a number from 0-9 please. ");
            D = input.nextLong();

            DString = Long.toString(D);

            valInNum(Count,NString,DString ,sameNum,N,D);

            input.close();

        }
            
    public static void valInNum(int Count,String NString,String DString,int sameNum,long N, long D)
    {
        if (Count <= NString.length()-1) 
        {
            if (DString.charAt(0) == NString.charAt(Count))
            {
                sameNum++;
                Count++;
                valInNum(Count,NString,DString ,sameNum,N,D);
            }

            else if (DString.charAt(0) != NString.charAt(Count))
            {
                Count++;
                valInNum(Count,NString,DString ,sameNum,N,D);
            }
        }

        else if (Count == NString.length())
        {
            System.out.println("N = " + N);
            System.out.println("D = " + D);
            System.out.println("D appears in N " + sameNum + " times");
        }
        else 
        {
            System.out.println("Something went wrong in ValinNUm");
        }
    }
}

