// WAP to impliment public and private modifiers in class,methods and variables.

class Outer
{
    public int a = 20;
    private int b = 10;

    public static int sum(int a,int b)
    {
        return a + b;
    }

    private static int sub(int a,int b)
    {
        return a - b ;
    }

    private class Inner
    {
        int c = 5;
    }
     
}

public class Programm4 
{
    public static void main(String[] args) 
    {
        Outer O = new Outer();
//        Inner I = new Inner();

        System.out.println("Public Integer:- " + O.a);
//        System.out.println("Private Ineger:- " + O.b);

        int c = Outer.sum(6, 7);
//        int d = Inner.sub(7,5) ;
    }
}

/* 
 *  In this code class outer is a public class therefore it is accesable in psvm but inner class is private.
 * So it is not accesable. Same as Sum is a public method so it is accesable and sub is a private method so it is
 * not accesable on psvm.
 * And a is a public variable so it is accesable and b is a private method so it is not accesable.
 */
