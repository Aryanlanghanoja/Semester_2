// Write a Java Program to implement all types of Inheritance.

import java.util.*;

class Parent_Class
{
    int num1;
    int num2;

    public void Add(int num1,int num2)
    {
        this.num1 = num1 ;
        this.num2 = num2 ;

        System.out.println("This Is A Method Of Patent Class");
        System.out.println("The Addition Of " + this.num1 + " and " + this.num2 + " Is " + (this.num1 + this.num2));
    
    }
}

class Child_Class_1 extends  Parent_Class
{
    int num3;

    public void Add(int num1,int num2,int num3)
    {
        this.num1 = num1;
        this.num2 = num2 ;
        this.num3 = num3 ;

        System.out.println("This Is A Method Of Child Class-1");
        System.out.println("The Addition Of " + this.num1 + " , " + this.num2 + "and " + this.num3 + " Is " + (this.num1 + this.num2 + this.num3));

    }
}

class Child_Class_2 extends  Parent_Class
{
    int num4;

    public void Add(int num1,int num2,int num4)
    {
        this.num1 = num1 ;
        this.num2 = num2 ;
        this.num4 = num4 ;

        System.out.println("This Is A Method Of Child Class-2");
        System.out.println("The Addition Of " + this.num1 + " , " + this.num2 + "and " + this.num4 + " Is " + (this.num1 + this.num2 + this.num4));

    }
}

class Grand_Child extends Child_Class_1
{
    int num5;

    public void Add (int num1 , int num2 , int num3 , int num5)
    {
        System.out.println("This Is A Method Of Grand Child Class:-");
        System.out.println("The Addition Of " + this.num1 + " , " + this.num2 + "and " + this.num3 + " , "+ this.num5 + "" + " Is " + (this.num1 + this.num2 + this.num3 + this.num5));
        
    }
}

public class Programm_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
         
        Parent_Class P = new Parent_Class();
        Child_Class_1 C1 = new Child_Class_1();
        Child_Class_2 C2 = new Child_Class_2() ;
        Grand_Child G = new Grand_Child();

        System.out.print("Enter The Number-1:-");
        P.num1 = sc.nextInt();

        System.out.print("Enter The Number-2:-");
        P.num2 = sc.nextInt() ;

        System.out.print("Enter The Number-3:-");
        C1.num3 = sc.nextInt() ;
        C1.num1 =  P.num1 ;
        C1.num2 =  P.num2 ;

        System.out.print("Enter The Number-4:-");
        C2.num4 = sc.nextInt() ;
        C2.num1 =  P.num1 ;
        C2.num2 =  P.num2 ;

        System.out.print("Enter The Number-5:-");
        G.num5 = sc.nextInt() ;
        G.num3 = C1.num3 ;
        G.num1 = P.num1 ;
        G.num2 = P.num2 ;

        P.Add(P.num1, P.num2);
        C1.Add(C1.num1, C1.num2, C1.num3);
        C1.Add(C1.num1, C1.num2);
        C2.Add(C2.num1, C2.num2, C2.num4);
        C2.Add(C2.num1, C2.num2);
        G.Add(G.num1, G.num2);
        G.Add(G.num1, G.num2, G.num3);
        G.Add(G.num1, G.num2, G.num3, G.num5);

        sc.close();
    }
}
