// Write down a Java program to find perimeter and area of a circle using class and objects in java?

import java.util.Scanner;

class Circle
{
    Circle(int Radius)
    {
        System.out.println("The Perimeter Of A Circle Is " + (2*3.14159*Radius) + "\nThe Area Of A Circle Is " + (3.14159*Radius*Radius));
    }
}

public class Programm5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        int Radius ;

        System.out.println("Enter The Radius Of A Circle:-");
        Radius = sc.nextInt() ;

        Circle C1 = new Circle(Radius) ;

        sc.close();
    }
}
