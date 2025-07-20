import java.util.*;
class Square
{
    double height;
    double width;

}

public class Object
{
    public  static void main(String args[])
    {
        Square S1 = new Square();//Object Creation
        Scanner sc =new Scanner (System.in);

        S1.height = sc.nextDouble();
        S1.width = sc.nextDouble();
        System.out.println(S1.height + "\n" + S1.width);


    }
}