// Write a Java Program to Print Downward Triangle Star Pattern.

import java.util.*;

public class Programm5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter The Number Of Rows:-");
        num = sc.nextInt();

        for(int i=num;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }

            System.out.println();

        }

        sc.close();
        
    }
}
