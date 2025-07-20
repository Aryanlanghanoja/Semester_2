import java.util.*;

import javax.naming.InvalidNameException;

// WAP to impliment public and private modifiers in nested Class.


class Outer
{
    public int a = 20 ;
    private int b = 10 ;

    private class Inner
    {
        public int c = 30;
        private int d = 25;

        Inner(int num)
        {
            num = a ;
            System.out.println(num);
        }
    }
}

public class Programm5 
{
    public static void main(String[] args) 
    {
        Outer O = new Outer() ;
        Inner I = new Inner() ;
    }
}

/* In this Programm Inner class Is private.that is why we can't acess it  */
