import java.util.*;

class HCF_LCM 
{
    int num1,num2;

    HCF_LCM()
    {

    }

    HCF_LCM(int num1,int num2)
    {
        this.num1 = num1 ;
        this.num2 = num2 ;
        int HCF = 1;

        for(int i=1; i<=num1 && i<=num2;i++)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                HCF = i ;
            }
        }

        System.out.println("The HCF Of " + this.num1 + " And " + this.num2  + " Is " + HCF);
    }
}

class LCM
{
    int num1,num2 ;
    int LCM ;

    public int Find_LCM(int num1,int num2)
    {
        this.num1 = num1 ;
        this.num2 = num2 ;

        if(num2 == 0)
        {
            return num1 ;
        }

        return Find_LCM(num2, num1 % num2);
    }
}

public class Programm6 
{
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in) ;

            HCF_LCM h1 = new HCF_LCM();

            System.out.print("Enter The First Number:-");
            h1.num1 = sc.nextInt();

            System.out.print("Enter The Second Number:-");
            h1.num2 = sc.nextInt();

            HCF_LCM h2 = new HCF_LCM(h1.num1,h1.num2);

            LCM L1 = new LCM();

            int LCM = L1.Find_LCM(h1.num1,h1.num2) ;

            System.out.println("The LCM Of " + h1.num1 + " And " + h1.num2  + " Is " + (h1.num1*h1.num2)/LCM);

        }
}
