import java.util.* ;

abstract class Shape
{
    void getArea()
    {

    }
}

class Square extends Shape
{
    public double length;

    public void getArea()
    {
        System.out.println("The Area Of Square Is " + (this.length * this.length));
    }
}

class Rectangle extends Shape
{
    public double length ;
    public double breadth ;

    public void getArea()
    {
        System.out.println("The Area Of Square Is " + (this.breadth * this.length));
    }
}

class Circle extends Shape
{
    public double Radius ;

    public void getArea()
    {
        System.out.println("The Area Of Circle Is " + (3.14159 * this.Radius * this.Radius));
    }
}

public class Programm_1
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
        }

        else if(num == 2)
        {
            System.out.println("Enter The Length Of A Rectangle");
            rectangle.length = sc.nextInt();
            
            System.out.println("Enter The Breadth Of A Rectangle");
            rectangle.breadth = sc.nextInt() ;

            rectangle.getArea();
        }

        else if(num == 3)
        {
            System.out.println("Enter The Radius Of A Circle:-");
            circle.Radius = sc.nextInt();

            circle.getArea();
        }

        else
        {
            System.out.println("Enter The Valid Input");
        }

        sc.close();
    }
}