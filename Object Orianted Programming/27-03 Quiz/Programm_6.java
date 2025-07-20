import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

class Interest
{
    long Principle_Amount;
    int No_Of_Years;
    float Rate_of_Interest ;

    public void calInterest(long Principle_Amount,int No_Of_Years,float Rate_of_Interest)
    {
        System.out.print("Simple Interest On Rs." + Principle_Amount+ "/- For " + No_Of_Years + " Years At " + Rate_of_Interest + "% Is " + (Principle_Amount*No_Of_Years*Rate_of_Interest)/100);
    }
}

public class Programm_6 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in) ;

        Interest I1 = new Interest();

        System.out.print("Enter The Principle Amount:-");
        I1.Principle_Amount = sc.nextLong();

        System.out.print("Enter The Number Of Years:-");
        I1.No_Of_Years = sc.nextInt() ;

        System.out.print("Enter The Rate Of Interest:-");
        I1.Rate_of_Interest = sc.nextFloat() ;

        I1.calInterest(I1.Principle_Amount,I1.No_Of_Years,I1.Rate_of_Interest) ;

    }    
}
