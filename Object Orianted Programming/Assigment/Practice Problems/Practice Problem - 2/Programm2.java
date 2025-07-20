// Write down a Java program to create two classes : 
//class1 and class2 and then create the object of class1 in class2 and object of class2 in class1. 
//The main method will be written in class3.

import java.util.*;
class Object1
{
    String name;
    int Roll_no;
}

class Object2
{
    int marks;
}
public class Programm2 
{
    public static void main (String args[])
    {
        Object1  Obj1 = new Object1() ; 
        Object2 Obj2 = new Object2() ;  

        Scanner sc  = new Scanner (System.in);

        System.out.print("Enter Your Name:-");
        Obj1.name = sc.nextLine();

        System.out.print("Enter Your Roll-No:-");
        Obj1.Roll_no = sc.nextInt();

        System.out.print("Enter Your Marks:-");
        Obj2.marks = sc.nextInt();

        System.out.println("Student Details:-\nName:-"+Obj1.name + "\nRoll No:-"+Obj1.Roll_no + "\nMarks:-"+Obj2.marks);
    }
}
