/* Write down a Java program to create three class, 
then create parameterized constructors to initialize the properties of each class.*/ 

class Class_1
{
    int Mem_1;
    int Mem_2 ;

    Class_1(int num1, int num2)
    {
        Mem_1 = num1 ;
        Mem_2 = num2 ;
    }
}

class Class_2
{
    int Mem_1;
    int Mem_2 ;

    Class_2(int num1, int num2)
    {
        Mem_1 = num1 ;
        Mem_2 = num2 ;
    }
}

class Class_3
{
    int Mem_1;
    int Mem_2 ;

    Class_3(int num1, int num2)
    {
        Mem_1 = num1 ;
        Mem_2 = num2 ;
    }
}

public class Programm11 
{
    public static void main(String[] args) 
    {
        Class_1 C1 = new Class_1(5, 7);
        Class_2 C2 = new Class_2(5, 7);
        Class_3 C3 = new Class_3(5, 7);
    }
}
