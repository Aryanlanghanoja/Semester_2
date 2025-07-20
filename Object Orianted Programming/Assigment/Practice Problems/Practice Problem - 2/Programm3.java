/*  Write down a Java program to calculate the area of rectangle, square, triangle and circle 
using class and objects in java. */

import java.util.*; 
class Area
{
    Double Radius;
    Double Length;
    Double Breadth;
    Double Side_Length;

    public static double Circle(Double Radius)
    {
        return 3.14159*Radius*Radius ; 
    }

    public static double Rectangle(Double Length,Double Breadth)
    {
        return Length*Breadth ; 
    }

    public static double Square(Double Side_Length)
    {
        return  Side_Length*Side_Length;   
    }

}
public class Programm3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ; 

        Area area = new Area() ; 

        System.out.print("Enter The Radius Of A Circle:-");
        area.Radius = sc.nextDouble();

        System.out.print("Enter The Length Of Rectangel:-");
        area.Length = sc.nextDouble();

        System.out.print("Enter The Breadth Of Rectangel:-");
        area.Breadth = sc.nextDouble();

        System.out.print("Enter The Side Length Of Square:-");
        area.Side_Length = sc.nextDouble();

        System.out.print("The Area Of Circle Is "+area.Circle(area.Radius) + "\nThe Area Of Rectangle Is " + area.Rectangle(area.Length,area.Breadth) + "\nThe Area Of Square Is "+area.Square(area.Side_Length));
    }
}
