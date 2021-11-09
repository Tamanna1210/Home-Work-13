package HomwWork13;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
		Scanner in=new Scanner(System.in);
			System.out.println("Please write a word you want");
		 String word= in.nextLine();
		 
		if(!(word.isEmpty())) {
			if(word.length()%2!=0 && word.length()>=3) {
				System.out.println("Middle character of the word your wrote "+word+" is: "+
			word.charAt(word.length()/2));
			}else {
				System.out.println("your word has even numner of character");
			}
			
		}else {
			System.out.println("You didn't write anything, its empty");
		}

	}

}
