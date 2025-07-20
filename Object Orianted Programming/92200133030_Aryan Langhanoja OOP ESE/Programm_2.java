class StaticClass
{
    public static int x = 10;
    public static int y = 10;
    public static int z = 10;

    StaticClass()
    {
        this.x = this.x + 10 ;
        this.y = this.y + 20 ;
        this.z = this.z + 30 ;
    }

    public static void Display()
    {
        System.out.println("X After Increament " + x);
        System.out.println("Y After Increament " + y);
        System.out.println("Z After Increament " + z);
    }

}

public class Programm_2 
{
    public static void main(String[] args) 
    {
        StaticClass C1 = new StaticClass();
        StaticClass.Display(); 
    }
}
