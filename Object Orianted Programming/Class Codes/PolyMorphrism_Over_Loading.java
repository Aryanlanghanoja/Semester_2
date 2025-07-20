import java.util.Scanner;

class Prime_Number
{
    void Prime_Number(int num)
    {
        int i;
        for(i=2;i<num;i++)
        {
            if(num % i == 0)
            {
                break;
            }
        }

        if(i == num)
        {
            System.out.println(num + " Is A Prime Number");
        }

        else
        {
            System.out.println(num + " Is Not A Prime Number");
        }
    }

    void Prime_Number(int num1,int num2)
    {
        int max,min;

        if(num1 > num2)
        {
            max = num1 ;
            min = num2 ;
        }

        else
        {
            max = num2 ;
            min = num1 ;
        }

        for(int j=min;j<=max;j++)
        {
            int i;
            
            for(i=2;i<j;i++)
            {
                if(j%i==0)
                {
                    break;
                }
            }

            if(i==j)
            {
                System.out.print(j + " ");
            }
        }
    }
}

public class PolyMorphrism_Over_Loading
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

        Prime_Number P1 = new Prime_Number();

        P1.Prime_Number(5);
        P1.Prime_Number(0, 10);
        sc.close();
    }
}