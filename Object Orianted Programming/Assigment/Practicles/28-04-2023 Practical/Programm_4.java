import java.util.*;

interface Interface
{
    public void sum();
    public void sup();
}

class Interface_Class implements Interface
{
    int a;
    int b;

    public void sum()
    {
        System.out.println("Addition of " + this.a + " and " + this.b + " is " + (this.a + this.b));
    }

    public void sup()
    {
        System.out.println("Substraction of " + this.a + " and " + this.b + " is " + (this.a - this.b));
    }
}

abstract class Abstract_Class 
{
    public void sum()
    {

    }

    public void sup()
    {

    }
}

class Abstract_Child_Class extends Abstract_Class 
{
    int a;
    int b;

    public void sum()
    {
        System.out.println("Addition of " + this.a + " and " + this.b + " is " + (this.a + this.b));
    }

    public void sup()
    {
        System.out.println("Substraction of " + this.a + " and " + this.b + " is " + (this.a - this.b));
    }

}

public class Programm_4 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in) ;

        Abstract_Child_Class Abs = new Abstract_Child_Class();
        Interface_Class Int = new Interface_Class() ;

        System.out.println("Enter The Value Of A:-");
        Abs.a = sc.nextInt() ;

        System.out.println("Enter The Value Of B:-");
        Abs.b = sc.nextInt() ;

        Int.a = Abs.a ;
        Int.b = Abs.b ;

        Abs.sum();
        Abs.sup();

        Int.sum();
        Int.sup();
        
        sc.close();
    }
}
