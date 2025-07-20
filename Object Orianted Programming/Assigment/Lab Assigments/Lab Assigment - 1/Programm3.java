// Write a Java program to implement Switch Case.

import java.util.*;

public class Programm3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        int day;

        System.out.print("Enter The Number Of Day:-");
        day = sc.nextInt();

        switch (day) 
        {
            case 1:
            {

                System.out.print("The 1st Day Of The Week Is Monday");
                break;
            }

            case 2:
            {
                System.out.print("The 2nd Day Of The Week Is Tuesday");
                break;
            }

            case 3:
            {
                System.out.print("The 3rd Day Of The Week Is Wednesday");
                break;
            }

            case 4:
            {

                System.out.print("The 4th Day Of The Week Is Thursday");
                break;
            }

            case 5:
            {
                System.out.print("The 5th Day Of The Week Is Friday");
                break;
            }

            case 6:
            {
                System.out.print("The 6th Day Of The Week Is Saturday");
                break;
            }

            case 7:
            {
                System.out.print("The 7th Day Of The Week Is Sunday");
                break;
            }
        
            default:
            {
                System.out.println("Enter The Valid Choice");
                break;
            }
        }

        sc.close();
        
    }
}
