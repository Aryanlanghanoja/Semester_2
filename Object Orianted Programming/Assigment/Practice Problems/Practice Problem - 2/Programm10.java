/* Write down a Java program to Assign and print the roll number,
 phone number and address of two students having names "Sam" and "John" respectively 
 by creating two objects of class 'Student'. */

import java.util.*;

class Student
{   
    void print(String Name,int roll_no,long  phone_no,String Address)
    {
        System.out.println("Name:-" + Name +"\nRoll Number:-" + roll_no + "\nPhone Number:-" + phone_no + "\nAddress:-" + Address);
    }
}

public class Programm10 
{
    public static void main(String[] args) 
    {
        Student Sam = new Student();
        Student Ram = new Student(); 

        Sam.print("Sam", 15, 1234567890, "64C WallsStreat\n\n");
        Ram.print("Ram", 10, 876543210, "68D WallsStreat");
        
    }
}
