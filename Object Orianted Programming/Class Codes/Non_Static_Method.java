import java.util.*;

class Rectangle
{
    float height ;
    float width ;

    public void calArea()
    {
        System.out.println("Area Of Rectangle Is "+ height*width);
    }
}

public class Non_Static_Method 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ; 
        
        Rectangle R1 = new Rectangle() ;
        
        System.out.print("Enter The Height Of Rectangle:-");
        R1.height = sc.nextFloat();

        System.out.print("Enter The Width Of Rectangle:-");
        R1.width = sc.nextFloat();
        
        R1.calArea();
    }   
}

