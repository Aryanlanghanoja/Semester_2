import java.util.*;

public class Programm_4 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10] ;
        int del ;

        for(int i=0;i<10;i++)
        {
            System.out.println("Enter The Number At arr[" + i + "] :-");
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Enter the Index You Want To Delete:-");
        del = sc.nextInt();

        arr[del] = 0 ;

        for(int i=0;i<10;i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        sc.close();
    }
}
