//  Write a Java program to implement the Pythagoras theorem using constructors.

import java.util.*;
import java.math.*;

class Pythagoras
{
    Double Base,Height,Hypoteneus ;

    Pythagoras()
    {

    }

    Pythagoras(Double Base , Double Height)
    {
        this.Base = Base ;
        this.Height = Height;

        Hypoteneus = Math.sqrt((Math.pow(this.Base,2)) + (Math.pow(this.Height,2)));

        System.out.println("The Hypotenuse Of The Triangle Is " +Hypoteneus);

    }
}


public class Programm3 
{ 
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner (System.in) ;

        Pythagoras T1  = new Pythagoras();

        System.out.print("Enter The Base of The Triangle:-");
        T1.Base = sc.nextDouble();

        System.out.print("Enter The Height Of The Triangle:-");
        T1.Height = sc.nextDouble();

        Pythagoras T2  = new Pythagoras(T1.Base,T1.Height);

    } 

}
