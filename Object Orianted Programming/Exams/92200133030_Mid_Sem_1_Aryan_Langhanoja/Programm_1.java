// Write a program to check whether the given number is even or odd in Java.

import java.util.*;

public class Programm_1
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Enter The Number:-");
		num = sc.nextInt();

		(num % 2 ==0) ? System.out.print(num + " Is a Even Number") : System.out.print(num + " Is a Odd Number") ;

	}
}