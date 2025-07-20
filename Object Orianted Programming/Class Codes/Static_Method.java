import java.util.*;

class Rectangle
{
    static float height ;
    static float width ;

    static void calArea()
    {
        System.out.println("Area Of Rectangle Is "+ height*width);
    }
}

public class Static_Method 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The Height Of Rectangle:-");
        Rectangle.height = sc.nextFloat();

        System.out.print("Enter The Width Of Rectangle:-");
        Rectangle.width = sc.nextFloat();
        
        Rectangle.calArea();
    }
}
