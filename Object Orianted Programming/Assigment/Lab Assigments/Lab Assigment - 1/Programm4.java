// Write a Java program to print Right Triangle Star Pattern.

import java.util.*;

public class Programm4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter The Number Of Rows:-");
        num = sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();

        }

        sc.close();
        
    }
}
