public class Static_Block_Method_Variable 
{
    static int a =4;
    static int b;

    static void displayValue(int x)
    {
        System.out.println("Static Method Initialized.");
        System.out.println("X = " + x);
        System.out.println("A = "+ a);
        System.out.println("B = "+b);
    }   

    static
    {
        System.out.println("Static Block Initialized.");
        b = a * 5 ;
    }

    public static void main(String[] args) 
    {
        System.out.println("Inside Main()");
        displayValue(44);    
    }
}
