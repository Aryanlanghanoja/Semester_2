// Write down a Java program to check whether the entered number is a spy number or not using constructor .
//( A number is called spy number if the sum of its digits is equal to the product of its digits. For example 123 is a Spy number).

import java.util.* ;

class Practice
{
    int num;

    Practice()
    {

    }

    public int Spy_Num(int num)
    {
        int sum=0;
        int mul =1;
        int ans;

        for(int i=1;num!=0;i++)//1234
        {
            ans= num%10 ;//4,3,2,1
            sum  = sum + ans ;//4,7,9,10
            mul = mul*ans ;//4,12,24,24
            num=num/10 ;//123,12,1,0
        }

        if(mul == sum)
        {
            return 1;
        }

        else
        {
            return 0;
        }
    }
}


public class ABC
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;

        Practice P1 = new Practice();
    
        System.out.print("Enter The Number:-");
        P1.num = sc.nextInt();

        int ans = P1.Spy_Num(P1.num) ;

        if(ans == 1)
        {
            System.out.println("It Is A Spy Number");
        }

        else
        {
            System.out.println("It IS Not A Spy Number");
        }
    }
}
