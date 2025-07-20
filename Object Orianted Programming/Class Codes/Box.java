class Box1
{
    double length;
    double breadth ;
    double height ; 
    Box1(double length,double breadth,double height)
    {
        System.out.println("Constructing Box");
        this.length = length;
        this.breadth = breadth ;
        this.height = height ;
    }

    void volume()
    {
        double volume = length*breadth*height ;
        System.out.println("Volume Is " + volume);
    }
}


public class Box 
{
    public static void main(String args[])
    {
        Box1 myBox1 = new Box1(10,20,30);
        Box1 myBox2 = new Box1(3,6,9);

        myBox1.volume();
        myBox2.volume();

    }
}
