// Write a program to Find whether number is Prime or Not.

import java.util.*;

public class Programm10 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int num,i;

        System.out.print("Enter The Number:-");
        num = sc.nextInt();

        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                break;
            }
        }

        if(i==num)
        {
            System.out.println(num + " Is a Prime Number");
        }

        else
        {
            System.out.println(num + " Is Not a Prime Number");            
        }

    }
}
