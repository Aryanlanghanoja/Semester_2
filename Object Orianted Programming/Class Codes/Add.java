import java.util.*;

public class Add
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a,b;
        Add num = new Add();

        System.out.print("Enter The First Number:-");
        a=sc.nextInt();

        System.out.print("Enter The Second Number:-");
        b=sc.nextInt();

        int c=a+b;

        System.out.println("With Object:-" + num.add(a,b));
        System.out.println("Without Object:-" + add(c));

    }

   static  int add(int c)
    {
        return c;
    }

    public static int add(int a,int b)
    {
        return a+b ; 
    }
}