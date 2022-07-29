// Java program that takes a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

import java.util.Scanner; 
class weekday					//main class
{
	public static void main(String[] args) {
		int weekday;
		System.out.println("enter week day");
		Scanner sc = new Scanner(System.in);      //taking a value for user
		weekday = sc.nextInt();

		switch(weekday)
		{
		case 1:
			System.out.println("Day is :- Monday");
			break;
		case 2:
			System.out.println("Day is :- Tuesday");
			break;
		case 3:
			System.out.println("Day is :- Wednesday");
			break;
		case 4:
			System.out.println("Day is :- thursday");
			break;
		case 5:
			System.out.println("Day is :- Friday");
			break;
		case 6:
			System.out.println("Day is :- Saturday");
			break;
		case 7:
			System.out.println("Day is :- Sunday");
			break;
		}

	}
}