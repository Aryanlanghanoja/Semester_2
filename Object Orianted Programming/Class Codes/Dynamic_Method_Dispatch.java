class A
{
    void Display()
    {
        System.out.println("Inside Class A");
    }
}

class B extends A
{
    @Override
    void Display()
    {
        System.out.println("Inside Class B");
    }
}

class C extends A
{
    @Override
    void Display()
    {
        System.out.println("Inside Class C");
    }
}

public class Dynamic_Method_Dispatch 
{
    public static void main(String[] args) 
    {
        A a = new A() ;
        B b = new B() ;
        C c = new C() ;
        A r ;

        r = a ;
        r.Display();

        r = b ;
        r.Display();

        r = c ;
        c.Display();
    }    
}
