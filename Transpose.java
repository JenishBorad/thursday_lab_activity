//Write a java program to find transpose of a given matrix.

import java.util.Scanner;
 class Transpose
{
    public static void main(String args[])  
    {
	int i, j;
	System.out.println("Enter total rows and columns: ");
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();                       //get row and col value from user.
	int column = sc.nextInt();
	int array[][] = new int[row][column];   //create two dimenstion array.
	System.out.println("Enter matrix:");
 	for(i = 0; i < row; i++)              //using for loop.
  	{
   	    for(j = 0; j < column; j++)   
     	    {
        	array[i][j] = sc.nextInt();        //get value from user.
            }
  	}
 	System.out.println("Transpose is :- ");
  	for(i = 0; i < column; i++)                     //using loop for transpose
    	{
      	    for(j = 0; j < row; j++)             //using loop for transpose
            {
                System.out.print(+array[j][i]);  
            }
            System.out.println(" ");
        }
    }
}