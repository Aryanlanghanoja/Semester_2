//Write a program to display a greet message according to Marks obtained by student.

import java.util.*;

public class Programm6 
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);

        int marks;

        System.out.print("Enter Your Marks:-");
        marks = sc.nextInt();

        if(marks>=90)
        {
            System.out.println("Excellent!");
        }

        else if(marks>=80 && marks<90)
        {
            System.out.println("Very Good Performance!");
        }

        else if(marks>=70 && marks<80)
        {
            System.out.println("Quite Good!");
        }

        else if(marks>=60 && marks<70)
        {
            System.out.println("Good You can Improve!");
        }

        else if(marks>=50 && marks<60)
        {
            System.out.println("Improvement Needed!");
        }

        else 
        {
            System.out.println("Better Luck Next Time");
        }
    }
}
