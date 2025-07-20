import java.util.*;

class Rectangle
{
    Double Length;
    Double Breadth;

    public void calArea(Double Length,Double Breadth)
    {
        System.out.println("The Area Of Rectangel Is " + (double)Length*Breadth);
    }

}

public class Programm_3 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        Rectangle R1 = new Rectangle();

        System.out.print("Enter The Length Of Rectangle:-");
        R1.Length = sc.nextDouble();

        System.out.print("Enter The Breadth Opf Rectangle:-");
        R1.Breadth = sc.nextDouble();

        R1.calArea(R1.Length, R1.Breadth);
    }
}
