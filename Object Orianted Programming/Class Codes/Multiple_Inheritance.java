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
        System.out.println("A + B = " + (a+b));
    }
}

public class Multiple_Inheritance 
{
    public static void main(String[] args) 
    {
        Child_Class c1 = new Child_Class() ;   
        c1.sum(5,6) ;
        c1.sum(6, 7); 
    }
}
