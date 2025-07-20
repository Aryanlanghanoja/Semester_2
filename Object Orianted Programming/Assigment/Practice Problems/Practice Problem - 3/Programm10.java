// Write down a Java program to implement parameterized constructor.

class Cube
{
    double width , heigth , depth ;
    
    Cube(double w,double h,double d)
    {
        System.out.println("Constructing Cube:-");
        width = w ;
        heigth = h ;
        depth = d ;
    }

    double calVolume()
    {
        return  width*heigth*depth;
    }
}


public class Programm10 
{
    public static void main(String args[])
    {
        Double Vol ; 
        Cube c = new Cube (10,10,10) ;
        Vol = c.calVolume();
        System.out.println("Volume Is " + Vol);
    }
}

