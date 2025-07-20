import java.util.*;

class Spy_Num
{
    int num;

    Spy_Num()
    {

    }

    Spy_Num(int num)
    {
        this.num = num;
        int sum = 0;
        int multi = 1;
        int ans;
        int num1 = this.num ;

        while(num != 0)
        {
            ans = num % 10 ;
            sum =sum + ans ;
            multi = multi * ans ;
            num = num / 10 ;
        }

        if(sum == multi)
        {
            System.out.println( this.num + " Is a Spy Number");
        }

        else
        {
            System.out.println( this.num + " Is Not a Spy Number");                
        }

    }
} 


public class Programm7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;

        Spy_Num N1 = new Spy_Num();

        System.out.print("Enter The Number:-");
        N1.num = sc.nextInt() ;

        Spy_Num N2 = new Spy_Num(N1.num);

    }
}
