// Write a Java program to perform basic Calculator operations.

import java.util.*;

public class Programm1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num1,num2,choice;
        double ans;

        System.out.print("Enter The Choice:-\n1-Addition\n2-Substraction\n3-Multiplication\n4-Division\n5-Modulo Operation");
        System.out.println("\n6-Square\n7-Cube\n8-Square-Root\n9-Expotential\n10-Factorial");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
            {
                System.out.print("Enter The First Number:-");
                num1 = sc.nextInt();

                System.out.print("Enter The Second Number:-");
                num2 = sc.nextInt();

                ans = num1 + num2 ;
                System.out.print("The Addition Of " + num1 + " and" + num2 +" Is "+ ans);

                break;
            }

            case 2:
            {
                System.out.print("Enter The First Number:-");
                num1 = sc.nextInt();

                System.out.print("Enter The Second Number:-");
                num2 = sc.nextInt();

                ans = num1 - num2 ;
                System.out.print("The Substraction Of " + num1 + " and" + num2 +" Is "+ ans);

                break;
            }

            case 3:
            {
                System.out.print("Enter The First Number:-");
                num1 = sc.nextInt();

                System.out.print("Enter The Second Number:-");
                num2 = sc.nextInt();

                ans = num1 * num2 ;
                System.out.print("The Multiplication Of " + num1 + " and" + num2 +" Is "+ ans);

                break;
            }

            case 4:
            {
                System.out.print("Enter The First Number:-");
                num1 = sc.nextInt();

                System.out.print("Enter The Second Number:-");
                num2 = sc.nextInt();

                ans = num1 + num2 ;
                System.out.print("The Division Of " + num1 + " and" + num2 +" Is "+ ans);

                break;
            }

            case 5:
            {
                System.out.print("Enter The First Number:-");
                num1 = sc.nextInt();

                System.out.print("Enter The Second Number:-");
                num2 = sc.nextInt();

                ans = num1 % num2 ;
                System.out.print("The Modules-Operations Of " + num1 + " and" + num2 +" Is "+ ans);
   
                break;
            }

            case 6:
            {
                System.out.print("Enter The Number:-");
                num1 = sc.nextInt();

                ans =  Math.pow(num1, 2);
                System.out.print("The Square Of " + num1 + " Is "+ ans);

                break;
            }

            case 7:
            {
                System.out.print("Enter The Number:-");
                num1 = sc.nextInt();

                ans =  Math.pow(num1, 3);
                System.out.print("The Cube Of " + num1 + " Is "+ ans);

                break;
            }

            case 8:
            {
                System.out.print("Enter The Number:-");
                num1 = sc.nextInt();

                ans =  Math.sqrt(num1);
                System.out.print("The Square-root  Of " + num1 + " Is "+ ans);

                break;
            }

            case 9:
            {
                System.out.print("Enter The Base:-");
                num1 = sc.nextInt();

                System.out.print("Enter The Power:-");
                num2 = sc.nextInt();

                ans = Math.pow(num1, num2);
                System.out.print(num1 +" ^ " + num2 + " = "+ ans);
   
                break;
            }

            case 10:
            {
                System.out.print("Enter The Number:-");
                num1 = sc.nextInt();

                ans = 1;

                for(int i=1;i<=num1;i++)
                {
                    ans = ans * i ;
                }

                System.out.print("The Factorial Of " + num1 + " Is " + ans);
                break;
            }
        
            default:
            {
                System.out.print("Enter The Valid Choice.");

                break;
            }
        }

        sc.close();
    }
}