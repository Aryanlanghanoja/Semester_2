import java.security.PublicKey;
import java.util.Scanner;

class Train
{
    long Train_Number;
    String Train_Name;
    String Source;
    String Destination;
    String Date;
    int Capacity;

    public void Initialize()
    {
        this.Train_Number = 0 ;
        this.Train_Name = null ;
        this.Source = null ;
        this.Destination = null ;
        this.Date = null;
        this.Capacity = 0 ;
    }

    public void InputData(long Train_Number, String Train_Name,String Source,String Destination,String Date ,int Capacity)
    {
        this.Train_Number = Train_Number ;
        this.Train_Name = Train_Name ;
        this.Source = Source;
        this.Destination = Destination ;
        this.Date = Date;
        this.Capacity = Capacity ;
    }

    public void Display()
    {
        System.out.println("Information Of Train Are As Follows:-\nTrain Number :-" + Train_Number + "\nTrain Name :-" + Train_Name + "\nSource :-" + Source + "\nDestination :-" + Destination + "\nJourney Date :-" + Date + "\nCapacity :-" + Capacity);
    }
}

public class Programm_3 
{
    public static void main(String[] args) 
    {
        long Train_Number;
        String Train_Name;
        String Source;
        String Destination;
        String Date;
        int Capacity;

        Scanner sc = new Scanner(System.in);

        Train T = new Train();   
        T.Initialize();
        
        System.out.println("Enter The Number Of A Train:-");
        Train_Number = sc.nextLong();

        System.out.println("Enter The Name Of A Train:-");
        Train_Name = sc.next();

        System.out.println("Enter The Source Of A Train:-");
        Source = sc.next();

        System.out.println("Enter The Destination Of A Train:-");
        Destination = sc.next();

        System.out.println("Enter The Date Of Journey:-");
        Date = sc.next();

        System.out.println("Enter The Capacity Of A Train:-");
        Capacity = sc.nextInt();

        T.InputData(Train_Number, Train_Name, Source, Destination, Date, Capacity);

        T.Display();
        sc.close();

    }
}
