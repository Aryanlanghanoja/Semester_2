// Write a Java Program to Copy the values from one object to another Object

import java.util.*;

class Class
{
    String name;
    long roll_no;

    Class()
    {

    }

    Class(String name, long roll_no)
    {
       this.name = name ;
       this.roll_no = roll_no ;

        System.out.println("Student Details:-\nName:-"+ name+"\nRoll No:-"+roll_no);
    }

    Class(Class c1)
    {
        System.out.println("Copy Constructor:-");

        System.out.println("Student Details:-\nName:-"+ c1.name+"\nRoll No:-"+c1.roll_no);
    }
}

public class Programm1
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        Class c1 = new Class() ;

        System.out.print("Enter The Name:-");
        c1.name = sc.nextLine();

        System.out.print("Enter The Roll No:-");
        c1.roll_no =sc.nextLong();
        
        Class c2 = new Class(c1.name,c1.roll_no) ;
        Class c3 = new Class(c2);

    }
}