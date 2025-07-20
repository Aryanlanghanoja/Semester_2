// WAP to impliment public and private modifiers in class.

import java.util.*;

class Outer
{
    public int a = 20 ;

    private class inner
    {
        int b = 20;
    }
}

public class Programm1 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in) ;
       
       Outer O = new Outer();
      // Inner I = new Inner() ;

       System.out.println("Public Integer:- " + O.a);
       //System.out.println("Private Integer:- " + O.b);
      // System.out.println("Nested Class:- "+I.b);

       sc.close();
    }
}


/* This Code Is Showing the difference between the public and private variables. Here "a" is a is a public integer.
That Is why it will be printed. but b is protected therefore the existance of b is bounded for that class only.
// That is why it is showing error that b is not visible. */

