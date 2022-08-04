//Write a Java program to cyclically rotate a given array clockwise by one.

class clockwisearray
{
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60};
		System.out.println("original element is :- ")
		for(int i=0;i<a.length;i++)  //using for loop
		{
			System.out.println(+a[i]);  
		}
		System.out.println("reverse element is :- ");
	
		 for(int i=a.length-1;i>=0;i--)		//using for loop for reverse element.
		 {
		 	System.out.println(+a[i]);
		 }
	}
}
Footer
© 2022 GitHu