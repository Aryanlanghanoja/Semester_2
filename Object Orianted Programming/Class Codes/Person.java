import java.util.*;

class Charac
{
    String name;
    int age;
}

public class Person
{
    public static void main(String args[])
    {
        Charac p1= new Charac();
        Scanner sc = new Scanner (System.in);
        p1.name = sc.nextLine();
        p1.age=sc.nextInt();
        System.out.println(p1.name + "\n" + p1.age);

        
    }
}