import java.util.*;

class Square
{
    double Length;

    public void calArea(Double Length)
    {
        System.out.println("The Area Of Square Is " + (double)Length*Length);
    }

}

public class Programm_4 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        Square S1 = new Square();

        System.out.print("Enter The Side-Length Of A Square:-");
        S1.Length = sc.nextDouble();

        S1.calArea(S1.Length);
    }
}
