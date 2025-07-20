/*Write down a Java program to Print the sum, 
difference and product of two complex numbers by creating a class named 'Complex' with 
separate methods for each operation whose real and imaginary parts are entered by user. */

import java.util.*;

class Complex
{
    public static void Difference(int real_1,int real_2,int imaginary_1,int imaginary_2)
    {
        System.out.println("The Difference Is:-\nReal Part:- "+ (real_1 - real_2)+ "\nImaginary Part:- " + (imaginary_1 - imaginary_2));
    }

    public static void Product(int real_1,int real_2,int imaginary_1,int imaginary_2)
    {
        System.out.println("The Prodct Is:-\nReal Part:- "+ ((real_1*real_2) - (imaginary_1*imaginary_2))+ "\nImaginary Part:- " + ((imaginary_1*real_2) + (imaginary_2*real_1)));
    }
}


public class Programm8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        int real_1,real_2,imaginary_1,imaginary_2 ;
        
        System.out.println("Enter The Real Part Of Number-1:-");
        real_1 = sc.nextInt();

        System.out.println("Enter The Real Part Of Number-2:-");
        real_2 = sc.nextInt();
        
        System.out.println("Enter The Imaginary Part Of Number-1:-");
        imaginary_1 = sc.nextInt();

        System.out.println("Enter The Imaginary Part Of Number-2:-");
        imaginary_2 = sc.nextInt();

        Complex.Difference(real_1, real_2, imaginary_1, imaginary_2);
        Complex.Product(real_1, real_2, imaginary_1, imaginary_2);

        sc.close();
    }
}
