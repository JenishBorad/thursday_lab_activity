//Write a Java program to test the equality of two arrays.

import java.util.Arrays;
class Equalityoftwoarray
{
		public static void main( String args[] )
		{
			int [] ar1 = {10,20,30,40,80};
			int [] ar2 = {10,20,30,40,80};
			boolean ans = Arrays.equals(ar1,ar2);		//use equals methos.

			if(ans==true)									//for print message using if-else statment.
			{
				System.out.println("array are equals");
			}	
		        else 
		        {
		    	System.out.println("array are not equals");
		        }
 	        }
			
}