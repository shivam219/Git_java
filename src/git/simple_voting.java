package git; 

import java.util.Scanner;

public class simple_voting {

	public static void main(String[] args) {
		int age;
		System.out.print("Voting machine ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age = sc.nextInt();

		if (age > 18) {
			System.out.println("You can Vote ");
		}

		int shortBy = (18 - age);
		System.out.println("Sorry, you can't vote now!" 
		+ " You can vote after :" + shortBy + " years");

	}
}
