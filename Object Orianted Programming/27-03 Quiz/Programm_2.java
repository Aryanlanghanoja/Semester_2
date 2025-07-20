import java.util.*;

class Person
{
    String Name;
    int age;

    public void Display(String Name,int age)
    {
        System.out.println("Personn's Details:-\nName:- " + Name + "\nAge:- " + age);
    }
}

public class Programm_2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        Person P1 = new Person();

        System.out.print("Enter Your Name:-");
        P1.Name = sc.nextLine();

        System.out.print("Enter Your Age:-");
        P1.age = sc.nextInt();

        P1.Display(P1.Name, P1.age);
    }
}