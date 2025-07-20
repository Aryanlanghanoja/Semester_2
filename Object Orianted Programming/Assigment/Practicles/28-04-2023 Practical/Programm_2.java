import java.util.*;

interface Shape
{
    public void getArea() ;
}

interface Circumference extends Shape
{
    public void getCircumference() ;
}

class Square implements Circumference
{
    public double length;

    public void getArea()
    {
        System.out.println("The Area Of Square Is " + (this.length * this.length));
    }

    public void getCircumference()
    {
        System.out.println("The CIrcumference Is " + (4 *this.length));
    }
}

class Rectangle implements Circumference
{
    public double length ;
    public double breadth ;

    public void getArea()
    {
        System.out.println("The Area Of Square Is " + (this.breadth * this.length));
    }

    public void getCircumference()
    {
        System.out.println("The Circumference Of Rectangle Is " + (2*(this.length + this.breadth)));
    }
}

class Circle implements Circumference
{
    public double Radius ;

    public void getArea()
    {
        System.out.println("The Area Of Circle Is " + (3.14159 * this.Radius * this.Radius));
    }

    public void getCircumference()
    {
        System.out.println("The Circumference OF A Circle Is " + (2 * 3.14159 * this.Radius));
    }
}

public class Programm_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

        int num ;

        System.out.println("Enter The Number According You Will Get Area:-\n1-Square\n2-Rectangle\n3-Circle");
        num = sc.nextInt() ;

        Square square = new Square();
        Rectangle rectangle = new Rectangle() ;
        Circle circle = new Circle() ;

        if(num == 1)
        {
            System.out.println("Enter The Length Of  A Side  Of A Square:-");
            square.length = sc.nextInt();

            square.getArea();
            square.getCircumference();
        }

        else if(num == 2)
        {
            System.out.println("Enter The Length Of A Rectangle");
            rectangle.length = sc.nextInt();
            
            System.out.println("Enter The Breadth Of A Rectangle");
            rectangle.breadth = sc.nextInt() ;

            rectangle.getArea();
            rectangle.getCircumference();
        }

        else if(num == 3)
        {
            System.out.println("Enter The Radius Of A Circle:-");
            circle.Radius = sc.nextInt();

            circle.getArea();
            circle.getCircumference();
        }

        else
        {
            System.out.println("Enter The Valid Input");
        }

        sc.close();
    }
}
