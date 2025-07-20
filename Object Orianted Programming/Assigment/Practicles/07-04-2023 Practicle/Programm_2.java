//  Write a Java Program to Implement Static method.

import java.util.*;

class LCM
{
    public static int cal(int num1,int num2)
    {
        if(num2 == 0)
        {
            return num1 ;
        }

        else
        {
            return cal(num2,num1%num2) ;
        }
    }
}

public class Programm_2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

       int num1 ,num2 ;

        System.out.print("Enter The First Number:-");
        num1 = sc.nextInt();

        System.out.print("Enter The Second Number:-");
        num2 = sc.nextInt() ;

        int Add = (num1 * num2) / (LCM.cal(num1,num2) ) ;

        System.out.println("The LCM Of " + num1 + " and " + num2 + " Is " + Add);

        sc.close();
    }
}