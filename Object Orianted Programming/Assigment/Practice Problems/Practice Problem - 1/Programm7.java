//Write a program to find SUM AND PRODUCT of a given Digit.

import java.util.*;

public class Programm7 
{
    public static double PRODUCT(double a,double b)
    {
        return a*b;
    }

    public static double SUM(double a,double b)
    {
        return a+b;
    }

    public static void main(String args[])
    {
        double a,b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The First Number:-");
        a = sc.nextDouble();

        System.out.print("Enter The Second Number:-");
        b = sc.nextDouble();

        System.out.println("The Sum of "+a +" "+b+" Is "+ SUM(a,b) + " and The Product Is "+PRODUCT(a,b));
    }

}
