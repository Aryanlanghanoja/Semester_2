class MyAccounnt
{
    int accNo;
    double Balance;
    
    MyAccounnt()
    {

    }
}


public class Costructer 
{
    public static void main(String args[])
    {
        MyAccounnt Acc = new MyAccounnt();
        System.out.println("Balance = " + Acc.Balance + "/- Rs");
    }    
}
