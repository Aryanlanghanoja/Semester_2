// Write down a Java program finds if a number is odd or even.

import java.util.*;

public class Programm2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);

        int num;

        System.out.print("Enter The Number:-");
        num = sc.nextInt();

        if(num%2==0)
        {
            System.out.print(num + " Is Even Number");
        }

        else
        {
            System.out.print(num + " Is Odd Number");
        }
    }
}