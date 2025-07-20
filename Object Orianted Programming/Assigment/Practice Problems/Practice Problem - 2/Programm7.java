/* Write down a Java program to Print the average of three numbers entered by 
user by creating a class named 'Average' having a method to calculate and print the average. */

class Average
{
    public static void calAverage(int num1 , int num2 , int num3)
    {
        System.out.println("The Average Is" + (num1 + num2 + num3)/3);
    }
}

public class Programm7 
{
    public static void main(String[] args) 
    {
        Average.calAverage(5, 7, 6);   
    }
}
