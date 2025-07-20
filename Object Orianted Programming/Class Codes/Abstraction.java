abstract class Car
{
    public abstract double getAverage();
}

class Swift extends Car
{
    public double getAverage()
    {
        return 22.5;
    }
}

class Baleno extends Car
{
    public double getAverage()
    {
        return 23.2;
    }
}

public class Abstraction 
{
    public static void main(String ar[])
    {
        Swift s = new Swift();
        Baleno b = new Baleno();
        System.out.println(s.getAverage());
        System.out.println(b.getAverage());
    }
}
