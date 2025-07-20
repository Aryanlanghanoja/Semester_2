import java.util.*;

public class Programm2
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        int a=0,b=1,num;

        System.out.print("Enter Till How Many Terms You Want The Fibonacci Series ?");
        num = sc.nextInt();
        System.out.print(a + " " + b + " ");
        Fibonacci(num);

    }

    public static  void Fibonacci(int num)
    {
        int a=0,b=1,c;
        for(int i=1;i<=num;i++)
        {
            c = a + b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}