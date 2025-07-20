import java.util.*;

class Employee_Detail
{
    String Name;
    String Post;
    String Location;
    int age;
    int salary ; 

    public static void Details(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter The Name Of Employee-" + i+1 +":-");
            Employye[i].Name = sc.nextLine();

            System.out.print("Enter The Post Of Employee-" + i+1 +":-");
            Employye[i].Post = sc.nextLine();

            System.out.print("Enter The Location Of Employee-" + i+1 +":-");
            Employye[i].Location = sc.nextLine();

            System.out.print("Enter The Age Of Employee-" + i+! +":-");
            Employye1[i].age = sc.nextInt();

            System.out.print("Enter The Salary Of Employee-" + i+1 +":-");
            Employye[i].salary = sc.nextInt();
        }
    }

    public static void print(int n)
    {
        for(int j=0;j<n;j++)
        {
             System.out.println("Employee Details:-\nName:- "+ Employye[i].Name + "\nPost:- " + Employye[i].Post + "\nLOcation:- " + Employye[i].Location+ "\nAge:- "+ Employye[i].age +" Years" + "\nSalary:- Rs " + Employye[i].salary + " /-");

        }
    }
}

public class Programm1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Employee's etail You Want To Save:-");
        int num = sc.nextInt();

        Employee_Detail  Employye[] = new  Employee_Detail [num];

        Employee_Detail.Details(num);
        Employee_Detail.print(num);


    }
}