// Write down a Java program to add two distance using class and objects in java.

import java.util.*;

class Distance
{
    Distance(int Distace_1,int Distace_2)
    {
        System.out.println("The Total Distane Is " + (Distace_1 + Distace_2));
    }
}

public class Programm6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Distance D = new Distance(5, 7) ;
    }
}
