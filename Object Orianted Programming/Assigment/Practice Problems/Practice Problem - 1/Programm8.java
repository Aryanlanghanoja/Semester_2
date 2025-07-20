// Write a program to Find Factorial of Given no.

import java.util.*;

public class Programm8 
{
    public static void main(String args[])
    {
        int num,ans=1;

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter The Number:-");
        num = sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            ans=ans*i;
        }

        System.out.println("The Factorial Of "+ num + " Is " + ans);
    }
}
