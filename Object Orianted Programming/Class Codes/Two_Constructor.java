class Cube
{
    double width;
    double height;
    double depth;

    public Cube()
    {
        System.out.println("Constructing Cube");
        width = (double)10;
        height = (double)10;
        depth = (double)10 ; 
    }


    public Cube(double w,double h,double d)
    {
        System.out.println("Constructing Cube:-");
        width = w ;
        height = h ;
        depth = d ;
    }
}

public class Two_Constructor 
{
    public static void main(String args[])
    {
        Cube C1 = new Cube ();
        Cube c2 = new Cube ((double)20,(double)20,(double)20);

        System.out.println("Dimension Of Cube:-\nHeight - " + C1.height +"\nWidth - "+C1.width + "\nDepth - " + C1.depth);
        System.out.println("Dimension Of Cube:-\nHeight - " + c2.height +"\nWidth - "+c2.width + "\nDepth - " + c2.depth);
    }
}