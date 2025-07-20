class Cube
{
    double width;
    double height;
    double depth;

    Cube()
    {
        System.out.println("Constructing Cube");
        width = 10;
        height = 10;
        depth = 10 ; 
    }
}

public class No_Argument_Constructer 
{
    public static void main(String args[])
    {
        Cube C1 = new Cube() ;
        
        System.out.println("Dimension Of Cube:-\nHeight - " + C1.height +"\nWidth - "+C1.width + "\nDepth - " + C1.depth);
    }
}
