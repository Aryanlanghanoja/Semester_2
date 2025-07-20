import java.util.* ; 

public class Programm3
{
    public static void main(String args[])
    {

        Scanner sc =new Scanner (System.in);

        int num,a=0,b=1;

        System.out.println("Enter Till How Many Terms You Want The Fibonacci Series?");
        num = sc.nextInt();

        System.out.print(0 + " " + 1 + " ");

        int c = Fibonacci(a,b,num);

        System.out.print(c + " ");

    }

    public static int  Fibonacci(int x,int y,int num)
    {
        num--;
        int z=x+y;

        if(num<=2)
        {
            return x + y ;
        }

        else
        {
            System.out.print(z + " ");
            return  Fibonacci(y,z,num) ; 
        }
    }
}