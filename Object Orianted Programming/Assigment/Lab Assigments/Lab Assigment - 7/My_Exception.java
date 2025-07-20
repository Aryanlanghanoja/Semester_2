import java.util.*;

public class My_Exception
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number - 1 :-");
        int a = sc.nextInt();

        try 
        {
            int b;
            
            System.out.println("Enter The Number - 2 :-");
            b = sc.nextInt();

            int c = a / b ;
        } 

        catch (Exception e) 
        {
            System.out.println("Can't Divide By Zero.");
        }

        finally
        {
            System.out.println("Programm Ends");
        }
    }
}