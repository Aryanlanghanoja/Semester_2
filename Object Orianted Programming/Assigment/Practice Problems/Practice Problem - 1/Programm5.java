/* Write a program that will read a float type value from the keyboard and print the following output.
>Small Integer not less than the number.
->Given Number.
->Largest Integer not greater than the number. */

import java.util.*;
import java.math.*;
import  java. lang. Math ; 

public class Programm5
{
    
    public static void main(String args[])
    {
        double a;
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter The Float:-");
        a = sc.nextDouble();

        System.out.println("Small Integer not less than the number Is "+ Math.ceil(a));
        System.out.println("Given Number. Is "+ a);
        System.out.println("Largest Integer not greater than the number Is "+ Math.floor(a));
        
    }
}
