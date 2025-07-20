// Write down a Java program to check whether the entered number is a spy number or not using constructor .
//( A number is called spy number 
//if the sum of its digits is equal to the product of its digits. For example 123 is a Spy number).


import java.util.*;

class Object
{
    int num;

    Object()
    {

    }

    Object(int num)
    {
        this.num = num ;
        int new_num = num ;
        int i,sum=0,mul=1;

        for(i=1;num!=0;i++)
        {
            num = num/10 ;
        }

        int arr[] = new int[i] ;

        for(int k=0;k<i;k++)
        {
            arr[i] = new_num%10 ;
            new_num = new_num /10 ;
        }

        for(int j=0;j<i;j++)
        {
            sum = sum + arr[i] ;
            mul = mul*arr[i] ;
        }

        if(sum == mul)
        {
            System.out.println(this.num + " Is A Spy Number");
        }

        else
        {
            System.out.println(this.num + " Is Not Spy Number");
        }
    }
}

public class Practice_Question 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        Object O1 = new Object();

        System.out.print("Enter A Number To Check Whether The Number Is Spy Or Not:-");
        O1.num = sc.nextInt() ;

        Object O2 = new Object(O1.num) ;
    }    
}