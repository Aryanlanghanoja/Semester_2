// Write a program to print fibonacci series based on the user input in Java.

import java.util.*;

public class Programm_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in) ;
		int a = 0 , b = 1 , c , num;

		System.out.print("Enter A Number Of Term You Want In Your Fibbonacci Series:-");
		num = sc.nextInt();

		System.out.print(a + " " + b);

		for(int i=1;i<=num-2;i++)
		{
			c = a + b ;
		
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		
 
	}
}