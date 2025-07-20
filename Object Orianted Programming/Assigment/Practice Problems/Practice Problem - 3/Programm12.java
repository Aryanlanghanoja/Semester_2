/* Write down a Java program to two implement one copy and one non argument constructor in one class. */

// Write down a Java program to implement copy constructor.

import java.util.*;

class Class
{
    String Name;
    long Roll_No ;
    int GR_No;

    Class()
    {

    }

    Class(String Name, long Roll_No,int GR_No)
    {
        this.Name = Name;
        this.Roll_No = Roll_No ;
        this.GR_No = GR_No ;

        System.out.println("Parameterized Constructor:-");
        System.out.println("Student Details:-\n" + "Name:- " + this.Name + "\nRoll- No:- "+this.Roll_No + "\nSalary:- " + this.GR_No);
    }

    Class(Class c1)
    {
        System.out.println("Copy Constructor:-");
        System.out.println("Student Details:-\n" + "Name:- " + c1.Name + "\nRoll- No:- "+c1.Roll_No + "\nSalary:- " + c1.GR_No);
    }
}



public class Programm12
{
    public static void main(String args[])
    {
        Scanner sc  =  new Scanner (System.in) ;

        Class c1 = new Class() ;

        System.out.print("Enter Your Name:-");
        c1.Name = sc.nextLine() ;

        System.out.print("Enter Your Roll-No:-");
        c1.Roll_No = sc.nextLong();

        System.out.print("Enter Your GR No:-");
        c1.GR_No = sc.nextInt();

        Class c2 = new Class(c1.Name,c1.Roll_No,c1.GR_No) ;
        Class c3 = new Class(c2);

    }
}

