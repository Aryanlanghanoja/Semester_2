import java.util.*;

class Custom_Ex extends Exception
{
    Custom_Ex()
    {
        System.out.println("Custom Exception Occurs");
    }
}

public class Custom 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;

        int a , b ;

        System.out.println("Enter The Number:-");
        a = sc.nextInt();

        System.out.println("Enter The Second Number:-");
        b = sc.nextInt();

        if( b == 0)
        {
            try 
            {
                throw new Custom_Ex();
            } 
            
            catch (Exception My_Exception) 
            {
                System.out.println("Can't Divide By Zero");
            }
        }

        System.out.println("Answer :- " + (a/b));
    }
}
