package git;

import java.util.Scanner;

public class simple_voting {

	public static void main(String[] args) {
//		int age;
//		System.out.print("Voting machine ");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter age");
//		age = sc.nextInt();
//
//		if (age > 18) {
//			System.out.println("You can Vote ");
//		}
//
//		int shortBy = (18 - age);
//		System.out.println("Sorry, you can't vote now!" + " You can vote after :" + shortBy + " years");

//		String g = new String();
//		Scanner s = new Scanner(System.in);
//		g = s.next();
//
//		String male = "male";
//		String female = "female";
////		if (g.equals(male)||g.equals(female)) { // === check refference
//		if (g.equals(male) || g.equals(female)) { // === check refference
//			// .equa
//			System.out.println(g + "pass");
//
//		}
//		System.out.println("out");
		String o= new String("male");
		String mm = "male";
		String m = "male";
		System.out.println(m==mm); /// both are in string constant pool (scp)
		System.out.println(m.equals(mm));
		
		System.out.println(m.equals(o));
		System.out.println(m==o);// new object is heap that why refference is differet
	}
}
