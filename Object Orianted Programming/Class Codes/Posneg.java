import java.util.*;

public class Posneg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in) ; 
        int x;

        System.out.println("Enter A Number:-");
        x=sc.nextInt();

        if(x>0)
        {
            System.out.println( x +" Is a Positive Number");
        }

        else if(x<0)
        {
            System.out.println(x +" Is a Negative Number");
        }

        else
        {
            System.out.println("You Entered 0");
        }
    }
}