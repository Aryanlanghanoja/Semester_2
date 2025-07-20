// Write down a Java program checks if a number is Armstrong or not.
import java.util.*;
import java. lang. Math;

public class Programm1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        int num;
        boolean ans;

        System.out.print("Enter The Number:-");
        num = sc.nextInt();

        ans = Armstrong(num); 

        if(ans == true)
        {
            System.out.println(num + " Is An Armstrong Number");
        }

        else
        {
            System.out.println(num + " Is Not An Armstrong Number");
        }

    }


    public static boolean Armstrong(int x)
    {
        int i=0;
        int new_num = x ; 
        int num1=x;
        double ans;
        int sum=0;
        int  m;

        while(x!=0)//123
        {
            x = x/10 ; //12 1
            i++;
        }

        for(int j=1;j<=i;j++)
        {
            m = new_num%10 ; 
            ans = Math.pow(m,i);
            sum=sum + (int)ans ;
            new_num = new_num/10 ;
        }

        if(sum == num1)
        {
            return true ;
        }

        else
        {
            return false ;
        }
    }
}