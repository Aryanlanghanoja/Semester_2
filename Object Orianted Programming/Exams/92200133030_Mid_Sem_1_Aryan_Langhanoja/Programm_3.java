// Given an integer,N , print its first 10 multiples. Each multiple N*i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

import java.util.*;

public class Programm_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in) ;

		int num ;

		System.out.print("Enter A Number To Get It's Table:-");
		num = sc.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.println(num + " x " + i + (num*i));
		}

	}
}