import java.util.*;

class Area
{
    private double length;
    private double breadth;

    public void Dimension(double length , double breadth)
    {
        this.length = length ;
        this.breadth = breadth ;
    }

    public double takeArea()
    {
        return (length*breadth);
    }
}

public class Programm_1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Area A1 = new Area();
        Area A2 = new Area();
        Area A3 = new Area();

        Double[] length = new Double[3];
        Double[] breadth = new Double[3];
        Double[] Area = new Double[3];

        System.out.println("Enter The Length Of Rectangle-1:- ");
        length[0] = sc.nextDouble();

        System.out.println("Enter The Breadth Of Rectangle-1:- ");
        breadth[0] = sc.nextDouble();

        A1.Dimension(length[0], breadth[0]);

        Area[0] = A1.takeArea();

        System.out.println("The Area Of Rectngle - 1 Is " + Area[0]);

        System.out.println("Enter The Length Of Rectangle-2:- ");
        length[1] = sc.nextDouble();

        System.out.println("Enter The Breadth Of Rectangle-2:- ");
        breadth[1] = sc.nextDouble();

        A2.Dimension(length[1], breadth[1]);

        Area[1] = A2.takeArea();

        System.out.println("The Area Of Rectngle - 2 Is " + Area[1]);

        System.out.println("Enter The Length Of Rectangle-3:- ");
        length[2] = sc.nextDouble();

        System.out.println("Enter The Breadth Of Rectangle-3:- ");
        breadth[2] = sc.nextDouble();

        A3.Dimension(length[2], breadth[2]);

        Area[2] = A3.takeArea();

        System.out.println("The Area Of Rectngle - 3 Is " + Area[2]);

        sc.close();

    }
}