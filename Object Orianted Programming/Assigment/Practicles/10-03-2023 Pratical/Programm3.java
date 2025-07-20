import java.util.*;

class Employee_Detail
{
    String Name;
    String Post;
    String Location;
    int age;
    int salary ; 
}

public class Programm3
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);

            Employee_Detail  Employye= new  Employee_Detail() ; 
            System.out.print("Enter The Name Of Employee:-");
            Employye.Name = sc.nextLine();

            System.out.print("Enter The Post Of Employee:-");
            Employye.Post = sc.nextLine();

            System.out.print("Enter The Location Of Employee:-");
            Employye.Location = sc.nextLine();

            System.out.print("Enter The Age Of Employee:-");
            Employye.age = sc.nextInt();

            System.out.print("Enter The Salary Of Employee:-");
            Employye.salary = sc.nextInt();

             System.out.println("Employee Details:-\nName:- "+Employye.Name + "\nPost:- " + Employye.Post + "\nLOcation:- " + Employye.Location+ "\nAge:- "+ Employye.age +" Years" + "\nSalary:- Rs " + Employye.salary + " /-");
    }
}