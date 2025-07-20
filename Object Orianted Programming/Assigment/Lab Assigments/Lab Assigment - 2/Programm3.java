// WAP to impliment public and private modifiers in variables.

class Outer
{
    private int a = 20 ;
    public int b = 10 ;
}

public class Programm3 
{
    public static void main(String[] args) 
    {
        Outer O = new Outer() ;

        System.out.println("Public Integer Is :- " + O.b);
       // System.out.println("Private Integer Is :- " + O.a);
    }
}

/* This Code Is Showing the difference between the public and private variables. Here "a" is a is a public integer.
That Is why it will be printed. but b is protected therefore the existance of b is bounded for that class only.
 That is why it is showing error that b is not visible. */