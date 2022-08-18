//Write a java program that checks whether a given string is palindrome or not.

import java.util.Scanner;   
class Palidrom
{  
   public static void main(String args[])  
   {  
      String name, reverse = "";   
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string :- ");  
      name = sc.nextLine();   
      int length = name.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + name.charAt(i);  
      if (name.equals(reverse))  
         System.out.println("Enter string is a palindrome.");  
      else  
         System.out.println("Enter string is not  a palindrome.");   
   }  
}  
