class A
{
    protected int i;
    int j;

    void showj()
    {
        System.out.println("I = " + i + " J = " +j);
    }
}

class B extends A
{
    int k;

    void show()
    {
        System.out.println("K = " + k);
    }

    void add()
    {
        System.out.println("I + J + k :- " + (i+j+k));
    }
}

public class InheritanceDemo 
{
    public static void main(String[] args) 
    {
        A superObjA = new A() ;
        superObjA.i = 10 ;
        superObjA.j = 20 ; 

        B subObjB = new B() ;
        // subObjB.i = 10 ;
        // subObjB.j = 20 ;
        subObjB.k = 30;

        superObjA.showj();
        subObjB.show() ;
        subObjB.add();
    }
}

