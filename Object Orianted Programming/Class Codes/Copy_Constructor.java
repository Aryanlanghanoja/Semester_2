class Student
{
    String name;
    int rollno;

    Student(String s_name,int s_roll)
    {
        System.out.println("Constructor Invoked");
        this.name = s_name ;
        this.rollno = s_roll ;
    }

    Student(Student s)
    {
        System.out.println("Copy Constructor Invoked");

        this.name = s.name ;
        this.rollno = s.rollno ; 
    }

    public void display()
    {
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollno);
    }
}


public class Copy_Constructor 
{
    public static void main(String args[])
    {
        Student s1 = new Student("Aryan", 30) ;
        s1.display();

        Student s2 = new Student(s1) ;
        s2.display();
    }
}
