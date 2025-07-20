import java.util.*;

class Circle
{
    double Radius;

    Circle(double Radius)
    {
        this.Radius = Radius ;

        System.out.println("The Area Of The Circle With Radius "+this.Radius+ " Is "+3.14159*this.Radius*this.Radius);
    }
}


public class Programm5 
{
    public static void main(String[] args) 
    {
        Circle C1 = new Circle(10);
        Circle C2 = new Circle(5);
        Circle C3 = new Circle(15);
    }    
}
