import java.util.Scanner;

public class Lab_Assigment_5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Display a prompt and ask the user to enter his or her name.

        String Name;

        System.out.println("Please Enter Your Name:-");
        Name = sc.nextLine();

        // Display a prompt and ask the user to enter three integers, called a,b,c respectively. These numbers
        //will represent the coefficients of a quadratic equation:
        //ax2 + bx + c

        int a,b,c;
        double x;

        System.out.println("Now enter 3 numbers:-");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Print the formula they have entered on the screen.
        System.out.println("The formula you have entered is:");
        System.out.println(a + "x2 + " + b + "x + " + c);

        // Next print to the screen the derivative of the equation as a formula. For a quadratic equation
        //above, the derivative will be
        //2ax + b
        System.out.println("The derivative of the equation is:");
        System.out.println(2*a + "x" + " + " + b);

        //  Next ask the user to enter a value for x. x can be any number ,not just an integer, so you should
        //choose an appropriate type for the variable.
        System.out.println("Enter a value for x:-");
        x = sc.nextDouble();

        //  Print to the screen the result of 2ax + b
        System.out.println("The derivative at the above point is:");
        System.out.println(2*a*x + b);

        // Next, print to the screen the formula for the antiderivative of the function. If the original function
        //is ax2 + bx + c then the antiderivative will be:
        System.out.println("The anti-derivative of the equation is:");
        System.out.println(a/3 + "x^3 " + " + " + b/2 + "x^2 + " + c + "x");
        
        //Finally, print a message with your name followed by the name of your friend which was entered in
        //the first step. This message should say that your friend permanently owes you for helping them out.
        System.out.println(Name + ", you owe Aryan Langhanoja forever!");

        sc.close();
    }
}