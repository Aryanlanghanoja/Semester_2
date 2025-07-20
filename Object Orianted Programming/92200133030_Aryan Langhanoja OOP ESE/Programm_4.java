import java.util.*;

class Bank_Account
{
    long Account_Number ;
    String Depositer_Name;
    String Account_Type;
    Double Balance;

    public void Initialize(long Account_Number, String Depositer_Name , String Account_Type , Double Balance)
    {
        this.Account_Number = Account_Number ;
        this.Depositer_Name = Depositer_Name ;
        this.Account_Type = Account_Type ;
        this.Balance = Balance ;
    }

    public void Deposite(Double Amount)
    {
        this.Balance = Balance + Amount ;
    }

    public void Withdraw(Double Amount)
    {
        this.Balance  = Balance - Amount ;
    }

    public void DisplayBalance()
    {
        System.out.println("Your Balance Is " + this.Balance);
    }

    public void Details() 
    {
        System.out.println("Bank Account Details :-\nAccount Number :- "  + Account_Number + "\nDepositer Name :- " + Depositer_Name + "\nAccount Type :- " + Account_Type + "\nBalance :-" + Balance);
    }
}

public class Programm_4 
{
    public static void main(String[] args) 
    {
        long[] Account_Number  = new long[5];
        String[] Depositer_Name = new String[5];
        String[] Account_Type = new String[5];
        Double[] Balance = new Double[5];
        Double Deposite[] = new Double[5];
        Double WithDraw[] = new Double[5]; 

        Bank_Account A1 = new Bank_Account();
        Bank_Account A2 = new Bank_Account();
        Bank_Account A3 = new Bank_Account();
        Bank_Account A4 = new Bank_Account();
        Bank_Account A5 = new Bank_Account();   

        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5 ; i++)
        {
            System.out.println("Enter The Account Number For Customer -" + (i+1) + ":-");
            Account_Number[i] = sc.nextLong();

            System.out.println("Enter The Depositer's For Customer -" + (i+1) + ":-");
            Depositer_Name[i] = sc.next();

            System.out.println("Enter The Account Type For Customer -" + (i+1) + ":-");
            Account_Type[i] = sc.next();

            System.out.println("Enter The Balance For Customer -" + (i+1) + ":-");
            Balance[i] = sc.nextDouble();

            System.out.println("Enter The Deposite Amount For Customer -" + (i+1) + ":-");
            Deposite[i] = sc.nextDouble();

            System.out.println("Enter The WithDraw Amout For Customer -" + (i+1) + ":-");
            WithDraw[i] = sc.nextDouble();

        }

        A1.Initialize(Account_Number[0], Depositer_Name[0], Account_Type[0], Balance[0]);
        A2.Initialize(Account_Number[1], Depositer_Name[1], Account_Type[1], Balance[1]);
        A3.Initialize(Account_Number[2], Depositer_Name[2], Account_Type[2], Balance[2]);
        A4.Initialize(Account_Number[3], Depositer_Name[3], Account_Type[3], Balance[3]);
        A5.Initialize(Account_Number[4], Depositer_Name[4], Account_Type[4], Balance[4]);

        A1.Deposite(Deposite[0]);
        A2.Deposite(Deposite[1]);
        A3.Deposite(Deposite[2]);
        A4.Deposite(Deposite[3]);
        A5.Deposite(Deposite[4]);

        A1.Withdraw(WithDraw[0]);
        A2.Withdraw(WithDraw[1]);
        A3.Withdraw(WithDraw[2]);
        A4.Withdraw(WithDraw[3]);
        A5.Withdraw(WithDraw[4]);

        A1.DisplayBalance();
        A2.DisplayBalance();
        A3.DisplayBalance();
        A4.DisplayBalance();
        A5.DisplayBalance();
        
        A1.Details();
        A2.Details();
        A3.Details();
        A4.Details();
        A5.Details();

        sc.close();
        
    }
}
