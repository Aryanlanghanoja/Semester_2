//Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7.

public class Programm9 
{
    public static void main(String args[])
    {
        int sum=0;

        for(int i=100;i<=200;i++)
        {
            if(i%7==0)
            {
                sum = sum + i;
            }

            else
            {
                continue;
            }
        }

        System.out.println("The Sum of all Integers Less Than 200 and Greater Than 100 Is " + sum);
    }
}
