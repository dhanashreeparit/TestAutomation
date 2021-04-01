package ReversingString;

import java.util.Scanner;

public class Reverseofastring {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String ");
	String word = s.nextLine();
	String rev="";
	for(int i=word.length()-1;i>=0;i--) {
		rev=rev + word.charAt(i);
			
	}
	System.out.println("Reverse of  a string is "+rev);

}	

}
