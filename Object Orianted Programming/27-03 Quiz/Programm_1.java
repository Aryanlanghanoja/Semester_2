import java.util.*;

class Person
{
    String Name;
    int age;
}

public class Programm_1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        Person P1 = new Person();

        System.out.print("Enter Your Name:-");
        P1.Name = sc.nextLine();

        System.out.print("Enter Your Age:-");
        P1.age = sc.nextInt();

        System.out.println("Personn's Details:-\nName:- " + P1.Name + "\nAge:- " + P1.age);
    }
}