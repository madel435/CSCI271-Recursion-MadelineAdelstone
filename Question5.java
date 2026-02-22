//NVM couldn't find it 

import java.util.Scanner;

Scanner input = new Scanner(System.in)
String S = " ";
String S' = " ";
int SLength = 0;
int Position = 0; 

SLength = S.length();

String[] array = new array[SLength];
String[] newarray = new newarray[SLength];

System.out.println("What is your string?");
S = input.next();

array = S.split('');
if(Position == 0){

	newarray[Position] = array[SLength + 1];
	Position++;
}
 else {
newarray[Position] = array[SLength - 1];
}
