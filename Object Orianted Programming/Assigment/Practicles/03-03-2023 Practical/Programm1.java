import java.util.*;

public class Programm1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        int n,j,i;

        System.out.print("Enter The Number:-");
        n = sc.nextInt();

        for(i=2;i<=n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }

            if(i==j)
            {
                System.out.print(i + " ");
            }
        }
    }
}