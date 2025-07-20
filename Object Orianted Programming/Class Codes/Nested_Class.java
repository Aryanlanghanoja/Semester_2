class Outer
{
    private int a = 100;
    void outerMath()
    {
        class Inner
        {
            int b = 20;

            void innerMeth()
            {
                System.out.println("Inside innermeth()...." + (a+b));
            }
        }

        Inner i = new Inner();

        System.out.println("Inside outerMath()....");
        i.innerMeth() ;
    }
}

public class Nested_Class 
{
    public static void main(String[] args) 
    {
        Outer o = new Outer();
        o.outerMath();
    }    
}
