package git;

public class Send_constructor {

	public Send_constructor(String gender) {
		String male = "male";

		if (male == gender)

			System.out.println(gender + "\nYou can access");

		else
			System.out.println(gender + "\nYou don't  access");
	}

	public static void main(String[] args) {
		String gender = "male";

//				Scanner o = new Scanner(System.in);
//				gender = o.next();		
//				o.close();

		new Send_constructor(gender);
	}

}
