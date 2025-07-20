import java.util.*;

class Circle
{
    Double Radius;

    public void calArea(Double Radius)
    {
        System.out.println("The Area Of Square Is " + 3.14159*Radius*Radius);
    }

}

public class Programm_5 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        Circle C1 = new Circle();

        System.out.print("Enter The Radius Of A Circle:-");
        C1.Radius = sc.nextDouble();

        C1.calArea(C1.Radius);
    }
}
