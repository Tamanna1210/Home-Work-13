package HomwWork13;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter a Word.");
		String word=in.next();
		
		String rev="";
		for(int i=word.length()-1;i>=0;i--)
			   rev=rev+word.charAt(i);
			System.out.println("Reversed Word: "+rev);

	}

}
