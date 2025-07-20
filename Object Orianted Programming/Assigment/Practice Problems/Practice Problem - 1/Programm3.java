// Write down a Java program to convert Fahrenheit to Celsius.

import java.util.*;

public class Programm3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);

        double Celsius,Fahrenheit;

        System.out.print("Enter The Temperrature In Fahrenheit:-");
        Fahrenheit = sc.nextDouble();
         
        Celsius = ((Fahrenheit - 32)*5)/9;

        System.out.print(Fahrenheit + " Fahrenheit = " + Celsius + " Celsius");
        
    }
}