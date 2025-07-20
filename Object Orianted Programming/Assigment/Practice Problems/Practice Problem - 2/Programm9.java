/* Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
10. Name Year of joining Address
11. Robert 1994 64C WallsStreat
12. Sam 2000 68D WallsStreat
13. John 1999 26B WallsStreat */

class Employee
{
    public void getDetails(String Name , int year_of_joining , String Address)
    {
        System.out.println(Name  + "\t" + year_of_joining + "\t\t" + Address);
    }
    
}

public class Programm9 
{
    public static void main(String[] args) 
    {
        Employee E = new Employee() ;

        System.out.println("Name\tYear Of Joining\t\tAddress");

        E.getDetails("Robert", 1994, "64C WallsStreat");
        E.getDetails("Sam", 2000, "68D WallsStreat");
        E.getDetails("John", 1999, "26B WallsStreat");
 
    }   
}
