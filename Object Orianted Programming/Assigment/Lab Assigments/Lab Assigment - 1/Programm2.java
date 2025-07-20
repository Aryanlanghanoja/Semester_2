// Write a Java program to implement nested if -else.

import java.util.*;

public class Programm2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;

        double num1,num2,num3;

        System.out.print("Enter The First Number:-");
        num1 = sc.nextDouble() ;

        System.out.print("Enter The Second Number:-");
        num2 = sc.nextDouble() ;

        System.out.print("Enter The Third Number:-");
        num3 = sc.nextDouble() ;

        if(num1 > num2)
        {
            if(num1 > num3)
            {
                System.out.print("The Biggest Number Amongst " + num1 + "," + num2 + " And " + num3 + " Is " + num1);
            }

            else
            {
                System.out.print("The Biggest Number Amongst " + num1 + "," + num2 + " And " + num3 + " Is " + num3);
            }
        }

        else
        {
            if(num2 > num3)
            {
                System.out.print("The Biggest Number Amongst " + num1 + "," + num2 + " And " + num3 + " Is " + num2);
            }

            else
            {
                System.out.print("The Biggest Number Amongst " + num1 + "," + num2 + " And " + num3 + " Is " + num3);
            }
        }

        sc.close();
    }
}
