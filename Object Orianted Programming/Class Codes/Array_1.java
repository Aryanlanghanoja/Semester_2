import java.util.*;

public class Array_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        int Student[] = new int[10] ;

        for(int i=0;i<10;i++)
        {
            System.out.println("Enter The Number At Index - " + i + " :-");
            Student[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++)
        {
            System.out.println(Student[i]);
        }
        
        sc.close();
    }
}
