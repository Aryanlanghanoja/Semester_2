interface Parent_Class_1
{
    void sum(int a,int b);
}

interface Parent_Class_2
{
    void sum(int a,int b);
}

class Child_Class implements  Parent_Class_1 , Parent_Class_2
{
    public void sum(int a,int b)
    {
        System.out.println(a +" + " + b + " = " + (a+b));
    }
}

public class Programm_3
{
    public static void main(String[] args) 
    {
        Child_Class c1 = new Child_Class() ;   
        c1.sum(5,6) ;
        c1.sum(6, 7); 
    }
}
