// Java program to display the pattern like right angle triangle with a number. 

import java.util.Scanner;
class pattern 						//main class
{
	public static void main(String[] args) {
		int i,j,number;
		System.out.println("enter number :- ");
		Scanner sc = new Scanner(System.in);	//Taking the value from the user
		number = sc.nextInt();

		for(i=1;i<=number;i++) 			//moving a loop for row
		{
			for (j=1;j<=i;j++) 		//moving a loop for column
			{
				System.out.println(j);
			}
			System.out.println("");

		}

	}
}