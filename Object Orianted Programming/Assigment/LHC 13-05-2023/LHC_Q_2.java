import java.util.*;

interface GetInfo
{
    public double Amount() ;
    public void Pay(double Amount);
}

class Choose
{
    Scanner sc = new Scanner(System.in);

    public int Choose_One()
    {
        int method;
        System.out.println("Choose By Which System You Want To Pay:-");
        System.out.println("Choose Integer Accordingly:-");
        System.out.println("1)Credit Card\n2)PayPal\n3)Bit Coin");
        method  = sc.nextInt();
        return method;
    }
}

class CreditCardStrategy implements GetInfo
{
    private String Name;
    private long Card_No;
    private long expieryDate;
    private long VerificationCode;

    public void setName(String Name)
    {
        this.Name = Name; 
    }

    public void setCard_No(long Card_No)
    {
        this.Card_No = Card_No; 
    }

    public void setexpieryDate(long expieryDate)
    {
        this.expieryDate = expieryDate; 
    }

    public void setVerificationCode(long VerificationCode)
    {
        this.VerificationCode = VerificationCode; 
    }

    public double Amount()
    {
        double Amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount You Want To Pay:- ");
        Amount = sc.nextDouble();
        return Amount;
    }

    public void Pay(double Amount)
    {
        System.out.println("You Paid Rs." + Amount + "/- Via Credit Card");
    }

    public void Display()
    {
        System.out.println("Reciept:-\nPayment Method:- Credit Card\nName:- " + this.Name + "\nCard No:- " + this.Card_No  + "\nExpiery Date :- " + this.expieryDate + "\nVerification Code:- " + this.VerificationCode);
        System.out.println("Payment Successfull!");
    } 
}

class PayPalStrategy implements GetInfo
{
    private String EmailId;
    private String Password;
    private long Card_No;
    private long expieryDate;
    private long VerificationCode;

    public void setEmailId(String EmailId)
    {
        this.EmailId = EmailId; 
    }

    public void setPassword(String Password)
    {
        this.Password = Password; 
    }

    public void setCard_No(long Card_No)
    {
        this.Card_No = Card_No; 
    }

    public void setexpieryDate(long expieryDate)
    {
        this.expieryDate = expieryDate; 
    }

    public void setVerificationCode(long VerificationCode)
    {
        this.VerificationCode = VerificationCode; 
    }

    public double Amount()
    {
        double Amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount You Want To Pay:- ");
        Amount = sc.nextDouble();
        return Amount;
    }

    public void Pay(double Amount)
    {
        System.out.println("You Paid Rs." + Amount + "/- Paypal");
    }

    public void Display()
    {
        System.out.println("Reciept:-\nPayment Method:- Pay Pal\nEmail-Id:- " + this.EmailId + "\nPassword:- " + this.Password  + "\nCard - No :- " + this.Card_No + "\nExpiery Date :- " + this.expieryDate + "\nVerification Code :- " + this.VerificationCode);
        System.out.println("Payment Successfull!");
    } 
}

class BitCoinStrategy implements GetInfo
{
    private String EmailId;
    private String Password;
    private String walletAddress;
    private long Mobile_No;
    private long CryptoAcc_No;

    public double Amount()
    {
        double Amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount You Want To Pay:- ");
        Amount = sc.nextDouble();
        return Amount;
    }

    public void Pay(double Amount)
    {
        System.out.println("You Paid Rs." + Amount + "/- Paypal");
    }

    public void setEmailId(String EmailId)
    {
        this.EmailId = EmailId; 
    }

    public void setPassword(String Password)
    {
        this.Password = Password; 
    }

    public void setwalletAddress(String walletAddress)
    {
        this.walletAddress = walletAddress; 
    }

    public void setMobile_No(long Mobile_No)
    {
        this.Mobile_No = Mobile_No; 
    }

    public void setCryptoAcc_No(long CryptoAcc_No)
    {
        this.CryptoAcc_No = CryptoAcc_No; 
    }

    public void Display()
    {
        System.out.println("Reciept:-\nPayment Method:- BitCoin\nEmail-Id:- " + this.EmailId + "\nPassword:- " + this.Password  + "\nWallet ID:- " + this.walletAddress + "\nMobile No :- " + this.Mobile_No + "\nCrypto Accont No:-" + this.CryptoAcc_No);
        System.out.println("Payment Successfull!");
    } 
}

public class LHC_Q_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Choose C1 = new Choose();
        int method = C1.Choose_One();

        if(method == 1)
        {
            CreditCardStrategy C = new CreditCardStrategy();

            String Name;
            long Card_No;
            long expieryDate;
            long VerificationCode;

            System.out.println("Enter Your Name:-");
            Name = sc.nextLine();

            System.out.println("ENter Your Card No:-");
            Card_No = sc.nextLong();

            System.out.println("Enter Your Expiery Date:-");
            expieryDate = sc.nextLong();

            System.out.println("Enter Your Verification Code:-");
            VerificationCode = sc.nextLong();

            double Amount = C.Amount();
            C.setName(Name);
            C.setCard_No(Card_No);
            C.setexpieryDate(expieryDate);
            C.setVerificationCode(VerificationCode);
            C.Pay(Amount);
            C.Display();
        }

        else if(method == 2)
        {
            PayPalStrategy P = new PayPalStrategy();

            String EmailId;
            String Password;
            long Card_No;
            long expieryDate;
            long VerificationCode;

            System.out.println("Enter Your Email-ID:-");
            EmailId = sc.nextLine();

            System.out.println("ENter Your Password:-");
            Password = sc.nextLine();

            System.out.println("Enter Your Card-No:-");
            Card_No = sc.nextLong();

            System.out.println("Enter Your Debit Card's Expiery Date:-");
            expieryDate = sc.nextLong();

            System.out.println("Enter Your Verification Code:-");
            VerificationCode = sc.nextLong();

            double Amount = P.Amount();
            P.setEmailId(EmailId);
            P.setPassword(Password);
            P.setCard_No(Card_No);
            P.setexpieryDate(expieryDate);
            P.setVerificationCode(VerificationCode);

            P.Pay(Amount);
            P.Display();
        }

        else if(method == 3)
        {
            BitCoinStrategy B = new BitCoinStrategy();

            String EmailId;
            String Password;
            String walletAddress;
            long Mobile_No;
            long CryptoAcc_No;

            System.out.println("Enter Your Email-ID:-");
            EmailId = sc.nextLine();

            System.out.println("ENter Your Password:-");
            Password = sc.nextLine();

            System.out.println("Enter Your Wallet Address:-");
            walletAddress = sc.nextLine();

            System.out.println("Enter Your Mobile No:-");
            Mobile_No = sc.nextLong();

            System.out.println("Enter Your Crypto Account No:-");
            CryptoAcc_No = sc.nextLong();
            double Amount = B.Amount();
            B.setEmailId(EmailId);
            B.setPassword(Password);
            B.setwalletAddress(walletAddress);
            B.setMobile_No(Mobile_No);
            B.setCryptoAcc_No(CryptoAcc_No);

            B.Pay(Amount);
            B.Display();
        }
    }
}
