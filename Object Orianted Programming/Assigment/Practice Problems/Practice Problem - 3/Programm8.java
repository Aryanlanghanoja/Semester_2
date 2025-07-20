// Write down a Java program to implement arithmetic operators using constructors.

import java.util.*;

class Artematic
{
    int Num1;
    int Num2;

    Artematic()
    {

    }

    Artematic(int Num1 , int Num2)
    {
        System.out.println("Addition Is " + (Num1 + Num2));
        System.out.println("Substraction Is " + (Num1 - Num2));
        System.out.println("Multiplication Is " + (Num1 * Num2));
        System.out.println("The Division Is " + (Num1 / Num2));
    }
}

public class Programm8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        Artematic A = new Artematic() ;

        System.out.println("Enter The Number-1:-");
        A.Num1 = sc.nextInt();

        System.out.println("Entet The Number-2:-");
        A.Num2 = sc.nextInt() ;

        Artematic B = new Artematic(A.Num1, A.Num2) ;

        sc.close();
    }
}
