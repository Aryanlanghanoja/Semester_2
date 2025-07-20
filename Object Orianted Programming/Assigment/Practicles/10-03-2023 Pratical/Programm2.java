import java.util.*;

public class Programm2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        String A,B;

        System.out.print("Enter The First String:-");
        A = sc.nextLine();
        
        B=new StringBuilder(A).reverse().toString();

        if(A.equals(B))
        System.out.print("Palindrome");
        else
        System.out.print("Not Pelindrome");
    }
}