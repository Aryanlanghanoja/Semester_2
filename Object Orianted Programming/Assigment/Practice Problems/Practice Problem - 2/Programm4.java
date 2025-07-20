// Write down a Java program to calculate the grade of students in 5 subjects 
//i.e., mathematics, physics, chemistry, English and hindi using class and objects in java.

import java.util.*;

class Marks
{
    int Maths;
    int Physics;
    int Chemistry ;

    public void Marks()
    {
        Double Grade = ((double)this.Physics + (double)this.Chemistry + (double)this.Maths) / 3 ;

        System.out.println("The Grade Is " + Grade);
    }
}

public class Programm4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Marks M = new Marks();  

        System.out.println("Enter The Marks Of Physics:-");
        M.Physics = sc.nextInt() ;

        System.out.println("Enter The Marks Of Chemistry:-");
        M.Chemistry  = sc.nextInt() ;

        System.out.println("Enter The Marks Of Mathematics:-");
        M.Maths = sc.nextInt() ;

        M.Marks();

        sc.close();

    }
}
