package HomwWork13;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Please Enter the Mother's name.");
			String mom=in.next();
			System.out.println("Please enter the Father's name.");
			String dad=in.next();
			System.out.println("please enter the baby's gender.Boy or Girl");
			String gender=in.next();
			
			if(gender.equalsIgnoreCase("boy")) {
				System.out.println("You should name your baby boy:"+dad.toUpperCase().substring(0,3)+""+mom.toUpperCase().substring(2));
			}else if(gender.equalsIgnoreCase("girl")) {
					System.out.println("You should name your baby girl:"+mom.toUpperCase().substring(0,2)+""+dad.toUpperCase().substring(3));
	
				
			}else{
				System.out.println("Invalid entry for gender . Try again!!");
			}
		
	}

}
