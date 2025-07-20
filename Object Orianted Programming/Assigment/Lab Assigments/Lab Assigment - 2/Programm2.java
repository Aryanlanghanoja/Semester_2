// WAP to impliment public and private modifiers in methods.

class Outer
{
    // private static int sum(int a,int b)
    // {
    //     return a+b;
    // }

    public static int sub(int a,int b)
    {
        return a -b ;
    }

}
public class Programm2 
{
    public static void main(String[] args) 
    {
        //int sum = Outer.sum(5,6);
        int sub = Outer.sub(6,5);


        System.out.println(" " + sub);
    }

}

/*This code is showing the difference between the public and private methods. here sum is a private method
 *  Here Sum is a private method. that is why it is showing the error that sum is not visible. but sub is a public 
 * metod. so it is accesble.
 */