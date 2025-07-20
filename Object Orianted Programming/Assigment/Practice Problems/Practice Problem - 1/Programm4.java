// Write down a Java program finds largest of three numbers and then prints it.

import java.util.*;

public class Programm4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        int num1,num2,num3 ; 

        System.out.print("Enter The First Number:-");
        num1 = sc.nextInt();

        System.out.print("Enter The Second Number:-");
        num2 = sc.nextInt();

        System.out.print("Enter The Third Number:-");
        num3 = sc.nextInt();

        if(num1 == num2 || num2 == num3 || num3==num1)
        {
            System.out.print("Numbers are Not Distinct");
        }

        else
        {
            System.out.print("The Largest Number Amongst " + num1 + "," + num2 +" and " + num3 + " Is " + Largest(num1,num2,num3));
        }
    }

    public static int Largest(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                return a;
            }

            else
            {
                return c;
            }
        }

        else
        {
            if(b>c)
            {
                return b;
            }

            else
            {
                return c;
            }
        }
    }
}