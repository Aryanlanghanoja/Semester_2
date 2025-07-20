import java.util.*;

// This Class Is For The Taking Blue Print Of Two Wheeler 
abstract class Vehicle_Prop
{
    abstract public int Color();
    abstract public int Type();
    abstract public int Brakeing_System();
    abstract public int Engine_Capacity();
    abstract public int Battery_Capacity();
    abstract public void Final_Specification(int Vehicle_Int,int Color_Int,int Type_Int , int Brakeing_System , int Engine_Capacity , int Battery_Capacity);
    
}

class Vehicle 
{
    public int choice()
    {
        int choice;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter What You Want:-");
        System.out.println("1)Two-Wheeler\n2)Three-Wheeler\n3)Four-Wheeler");
        choice = sc.nextInt();
        return choice;
    }
}

// This Is The Sub Class Of Abstract Class To Asking The Choice.
class Two_wheeler extends Vehicle_Prop
{
    Scanner sc = new Scanner(System.in);
    public int Vehicle_Type()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Type Of Vehicle You Needed:-\n1)Bike-Basic\n2)Scooter-Basic\n3)Bike-Advanced\n4)Scooter-Advanced");
        System.out.println("Enter The Integer Accordingly:-");
        int Vehicle_Type = sc.nextInt();
        return Vehicle_Type;
    }

    public int Color()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now We will Select The Color Of Your Vehicle:-");
        System.out.println("Enter The Number According To Your Required Color:-\n1)Red\n2)Blue\n3)Green\n4)Yellow\n5)Orange\n6)Black\n7)White\n8)Pink\n9)Cream\n10)Grey");
        int Color = sc.nextInt();
        return Color;
    }

    public int Type()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now We will Select The Type Of Your Vehicle:-");
        System.out.println("Enter The Number According To Your Required Type:-\n1)Conventional\n2)EV\n3)Hybrid");
        int Type = sc.nextInt();
        return Type;
    }

    public int Brakeing_System()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if You Want Disc Brake and Enter 0 If You Don't:-");
        int Brake = sc.nextInt();
        return Brake;
    }

    public int Engine_Capacity()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Engine Capacity Of Your Wehicle In CC:-");
        int Engine_Capacity = sc.nextInt();
        return Engine_Capacity;
    }

    public int Battery_Capacity()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Battery Capacity Of Your Wehicle In Kwh:-");
        int Battery_Capacity = sc.nextInt();
        return Battery_Capacity;
    }

    public void Final_Specification(int Vehicle_Int,int Color_Int,int Type_Int , int Brakeing_System , int Engine_Capacity , int Battery_Capacity)
    {
        String Vehicle[] = {"Bike-Basic","Scooter-Basic","Bike-Advanced","Scooter-Advanced"}; 
        String Color[] = {"Red", "Blue" , "Green" , "Yellow" , "Orange" , "Black" , "White" , "Pink" , "Cream" , "Grey"};
        String Type[] =  {"Conventional" , "EV" , "Hybrid"};
        String Brake[] = {"With Disc Brake" , "Without Disc Brake"};
        System.out.println("Your Vehicle Has The Following Specifications:-\nVehicle Type :- " + Vehicle[Vehicle_Int -1] + "\nColor:- " + Color[Color_Int -1 ] + "\nType:- " + Type[Type_Int -1] + "\nBraking System:- " + Brake[Brakeing_System-1] + "\nEngine Capacity:- " + Engine_Capacity + " CC\nBattery Capacity:- " + Battery_Capacity + " KWh");
    }
}

class Three_wheeler extends Vehicle_Prop
{
    Scanner sc = new Scanner(System.in);
    public int Vehicle_Type()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Type Of Vehicle You Needed:-\n1)Richshaw-Basic\n2)Richshaw-Advanced");
        System.out.println("Enter The Integer Accordingly:-");
        int Vehicle_Type = sc.nextInt();
        return Vehicle_Type;
    }

    public int Color()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now We will Select The Color Of Your Vehicle:-");
        System.out.println("Enter The Number According To Your Required Color:-\n1)Red\n2)Blue\n3)Green\n4)Yellow\n5)Orange\n6)Black\n7)White\n8)Pink\n9)Cream\n10)Grey");
        int Color = sc.nextInt();
        return Color;
    }

    public int Type()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now We will Select The Type Of Your Vehicle:-");
        System.out.println("Enter The Number According To Your Required Type:-\n1)Conventional\n2)EV\n3)Hybrid");
        int Type = sc.nextInt();
        return Type;
    }

    public int Brakeing_System()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if You Want Disc Brake and Enter 0 If You Don't:-");
        int Brake = sc.nextInt();
        return Brake;
    }

    public int Engine_Capacity()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Engine Capacity Of Your Wehicle In CC:-");
        int Engine_Capacity = sc.nextInt();
        return Engine_Capacity;
    }

    public int Battery_Capacity()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Battery Capacity Of Your Wehicle In Kwh:-");
        int Battery_Capacity = sc.nextInt();
        return Battery_Capacity;
    }

    public void Final_Specification(int Vehicle_Int,int Color_Int,int Type_Int , int Brakeing_System , int Engine_Capacity , int Battery_Capacity)
    {
        String Vehicle[] = {"Richshaw-Basic","Richshaw-Advanced"};
        String Color[] = {"Red", "Blue" , "Green" , "Yellow" , "Orange" , "Black" , "White" , "Pink" , "Cream" , "Grey"};
        String Type[] =  {"Conventional" , "EV" , "Hybrid"};
        String Brake[] = {"With Disc Brake" , "Without Disc Brake"};
        System.out.println("Your Vehicle Has The Following Specifications:-\nVehicle Type :- " + Vehicle[Vehicle_Int -1] + "\nColor:- " + Color[Color_Int -1 ] + "\nType:- " + Type[Type_Int -1] + "\nBraking System:- " + Brake[Brakeing_System-1] + "\nEngine Capacity:- " + Engine_Capacity + " CC\nBattery Capacity:- " + Battery_Capacity + " KWh");
    }
}

class Four_wheeler extends Vehicle_Prop
{
    Scanner sc = new Scanner(System.in);
    public int Vehicle_Type()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Type Of Vehicle You Needed:-\n1)Car-Basic\n2)Car-Advanced\n3)Bus-Basic\n4)Bus-Advanced\n5)Truck-Basic\n6)Truck-Advanced");
        System.out.println("Enter The Integer Accordingly:-");
        int Vehicle_Type = sc.nextInt();
        return Vehicle_Type;
    }

    public int Color()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now We will Select The Color Of Your Vehicle:-");
        System.out.println("Enter The Number According To Your Required Color:-\n1)Red\n2)Blue\n3)Green\n4)Yellow\n5)Orange\n6)Black\n7)White\n8)Pink\n9)Cream\n10)Grey");
        int Color = sc.nextInt();
        return Color;
    }

    public int Type()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now We will Select The Type Of Your Vehicle:-");
        System.out.println("Enter The Number According To Your Required Type:-\n1)Conventional\n2)EV\n3)Hybrid");
        int Type = sc.nextInt();
        return Type;
    }

    public int Brakeing_System()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if You Want Disc Brake and Enter 0 If You Don't:-");
        int Brake = sc.nextInt();
        return Brake;
    }

    public int Engine_Capacity()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Engine Capacity Of Your Wehicle In CC:-");
        int Engine_Capacity = sc.nextInt();
        return Engine_Capacity;
    }

    public int Battery_Capacity()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Battery Capacity Of Your Wehicle In Kwh:-");
        int Battery_Capacity = sc.nextInt();
        return Battery_Capacity;
    }

    public void Final_Specification(int Vehicle_Int,int Color_Int,int Type_Int , int Brakeing_System , int Engine_Capacity , int Battery_Capacity)
    {
        String Vehicle[] = {"Car-Basic","Car-Advanced","Bus-Basic","Bus-Advanced","Truck-Basic","Truck-Advanced"};// 1)Car-Basic\n2)Car-Advanced\n3)Bus-Basic\n4)Bus-Advanced\n5)Truck-Basic\n6)Truck-Advanced
        String Color[] = {"Red", "Blue" , "Green" , "Yellow" , "Orange" , "Black" , "White" , "Pink" , "Cream" , "Grey"};
        String Type[] =  {"Conventional" , "EV" , "Hybrid"};
        String Brake[] = {"With Disc Brake" , "Without Disc Brake"};
        System.out.println("Your Vehicle Has The Following Specifications:-\nVehicle Type :- " + Vehicle[Vehicle_Int -1] + "\nColor:- " + Color[Color_Int -1 ] + "\nType:- " + Type[Type_Int -1] + "\nBraking System:- " + Brake[Brakeing_System-1] + "\nEngine Capacity:- " + Engine_Capacity + " CC\nBattery Capacity:- " + Battery_Capacity + " KWh");
    }
}

// This Class Is For Deciding The Price.
class Price_TWO
{
    public int Final_Price(int Vehicle_Int,int Color_Int,int Type_Int , int Brakeing_System)
    {
        int Price_Vehicle = 50000;
        int Color_P[] = {5000, 6000 , 6500 , 8000 , 4500 , 4000 , 10000 , 85000 , 9500 , 9000};
        int Type_P[] =  {125/100 , 200/100 , 250/100};
        int Brake_P[] = {10000 , 5000};

        Price_Vehicle = Price_Vehicle + Color_P[Color_Int] + Type_P[Type_Int]  + Brake_P[Brakeing_System] ;
        return Price_Vehicle;
    }

    public void Display_Price(int Price)
    {
        System.out.println("Your Two-Wheeler Cost Is Rs." + Price + " /- Only");
    }
}

class Price_THREE
{
    public int Final_Price(int Vehicle_Int,int Color_Int,int Type_Int , int Brakeing_System)
    {
        int Price_Vehicle = 200000;
        int Color_P[] = {5000, 6000 , 6500 , 8000 , 4500 , 4000 , 10000 , 85000 , 9500 , 9000};
        int Type_P[] =  {125/100 , 200/100 , 250/100};
        int Brake_P[] = {10000 , 5000};

        Price_Vehicle = Price_Vehicle + Color_P[Color_Int] + Type_P[Type_Int]  + Brake_P[Brakeing_System] ;
        return Price_Vehicle;
    }

    public void Display_Price(int Price)
    {
        System.out.println("Your Three-Wheeler Cost Is Rs." + Price + " /- Only");
    }
}

class Price_FOUR
{
    public int Final_Price(int Vehicle_Int,int Color_Int,int Type_Int , int Brakeing_System)
    {
        int Price_Vehicle = 500000;
        int Color_P[] = {5000, 6000 , 6500 , 8000 , 4500 , 4000 , 10000 , 85000 , 9500 , 9000};
        int Type_P[] =  {125/100 , 200/100 , 250/100};
        int Brake_P[] = {10000 , 5000};

        Price_Vehicle = Price_Vehicle + Color_P[Color_Int] + Type_P[Type_Int]  + Brake_P[Brakeing_System] ;
        return Price_Vehicle;
    }

    public void Display_Price(int Price)
    {
        System.out.println("Your Four-Wheeler Cost Is Rs." + Price + " /- Only");
    }
}

// THis Class Is for Exchange The Specification If User Want.
class Exchange_Specification extends Two_wheeler
{
    public Boolean Exchange()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 If You Want To Change The Specification Of Your Vehicle Otherwise Enter 0:-");
        int Decision = sc.nextInt();

        if(Decision == 1)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public void Final_Specification(int Vehicle_Int,int Color_Int,int Type_Int , int Brakeing_System , int Engine_Capacity , int Battery_Capacity)
    {
        String Vehicle[] = {"Bike-Basic","Scooter-Basic","Bike-Advanced","Scooter-Advanced"}; 
        String Color[] = {"Red", "Blue" , "Green" , "Yellow" , "Orange" , "Black" , "White" , "Pink" , "Cream" , "Grey"};
        String Type[] =  {"Conventional" , "EV" , "Hybrid"};
        String Brake[] = {"With Disc Brake" , "Without Disc Brake"};
        System.out.println("New Specifications Of Your Vehicle :-\nVehicle Type :- " + Vehicle[Vehicle_Int -1] + "\nColor:- " + Color[Color_Int -1 ] + "\nType:- " + Type[Type_Int -1] + "\nBraking System:- " + Brake[Brakeing_System-1] + "\nEngine Capacity:- " + Engine_Capacity + " CC\nBattery Capacity:- " + Battery_Capacity + " KWh");
    }

}

// This Class Is for giving rating
class Rating extends Two_wheeler
{
    Rating(int Vehicle_Int ,int Color_Int,int Type_Int , int Brakeing_System , int Engine_Capacity , int Battery_Capacity)
    {
        if((Color_Int != 6 || Color_Int != 7 || Color_Int != 9 || Color_Int != 10) && (Type_Int != 1) && (Brakeing_System != 2))
        {
            System.out.println("Your Vehicle Is Rated As A Pro");
        }

        else if((Color_Int == 6 || Color_Int == 7 || Color_Int == 9 || Color_Int == 10) && (Type_Int == 1) && (Brakeing_System == 2))
        {
            System.out.println("Your VEhicle Is Rated As A Basic");
        }
    }
}

// This class Is for payment
class Payment
{
    public int Paid_Amount(int Price)
    {
        Scanner sc = new Scanner(System.in);
        int Amount;
        System.out.println("Enter The Amount Which You Are Paying In Advance:-");
        Amount  = sc.nextInt();
        System.out.println("You're Paid Rs." + Amount + "/- And Pending Amount Is Rs." + (Price - Amount)  + "/- Only.");
        return (Price - Amount);
    }
}

// this class Is for Describing The Process
class Process
{
    public void Base_Model()
    {
        System.out.println("The 30% Construction Is Done");
    }

    public void Moderate_Model()
    {
        System.out.println("The 50% Construction Is Done");
    }

    public void Advance_Model()
    {
        System.out.println("The 100% Construction Is Done");
    }

    public void Test()
    {
        System.out.println("The Final Test Is Done. Your VEhicle Is Rady To Dispatch.");
    }
}

// This Class Is for Completion
class Complete
{
    public void Pay(int Amount)
    {
        System.out.println("Complete The Payment Of Rs." + Amount +  "/- And Take Your Vehicle.");
        System.out.println("Payment Done! Enjoy Your Journey.");

    }
}

public class Main
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome To The World Of Automotives. We are Here To Provide You A VEhicle Of Your Requirement And Your Choice");
        Vehicle V = new Vehicle();
        int Choice = V.choice();

        switch (Choice) {
            case 1:
            {
                Two_wheeler V1 = new Two_wheeler();
                Price_TWO P_V1 = new Price_TWO();
                Exchange_Specification E1 = new Exchange_Specification();
        
                int Vehicle_Int = V1.Vehicle_Type();
                int Color_Int = V1.Color();
                int Type_Int = V1.Type();
                int Brakeing_System = V1.Brakeing_System();
                int Engine_Capacity = V1.Engine_Capacity();
                int Battery_Capacity = V1.Battery_Capacity();
                V1.Final_Specification(Vehicle_Int, Color_Int, Type_Int, Brakeing_System, Engine_Capacity, Battery_Capacity);
        
                int Price = P_V1.Final_Price(Vehicle_Int, Color_Int, Type_Int, Brakeing_System);
                P_V1.Display_Price(Price);
        
                Boolean Decision = E1.Exchange();
        
                if(Decision == true)
                {
                    int Color_Int_E = E1.Color();
                    int Type_Int_E = E1.Type();
                    int Brakeing_System_E = E1.Brakeing_System();
                    int Engine_Capacity_E = E1.Engine_Capacity();
                    int Battery_Capacity_E = E1.Battery_Capacity();
                    V1.Final_Specification(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E, Engine_Capacity_E, Battery_Capacity_E);
                    int Price_N = P_V1.Final_Price(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E);
                    P_V1.Display_Price(Price_N);
                    Rating R1 = new Rating(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E, Engine_Capacity_E, Battery_Capacity_E);
                    Payment P1 = new Payment();
                    int Left = P1.Paid_Amount(Price_N);
                    Process Pr = new Process();
                    Pr.Base_Model();
                    Pr.Moderate_Model();
                    Pr.Advance_Model();
                    Pr.Test();
                    Complete C1 = new Complete();
                    C1.Pay(Left);
                }
        
                else
                {
                    Rating R1 = new Rating(Vehicle_Int,Color_Int,Type_Int,Brakeing_System,Engine_Capacity,Battery_Capacity);
                    Payment P1 = new Payment();
                    int Left = P1.Paid_Amount(Price);
                    System.out.println("Your Vehicle Is Under Construction");
                    Process Pr = new Process();
                    Pr.Base_Model();
                    Pr.Moderate_Model();
                    Pr.Advance_Model();
                    Pr.Test();
                    Complete C1 = new Complete();
                    C1.Pay(Left);
                }
                
                break;
            }

            case 2:
            {
                Three_wheeler V1 = new Three_wheeler();
                Price_THREE P_V1 = new Price_THREE();
                Exchange_Specification E1 = new Exchange_Specification();
        
                int Vehicle_Int = V1.Vehicle_Type();
                int Color_Int = V1.Color();
                int Type_Int = V1.Type();
                int Brakeing_System = V1.Brakeing_System();
                int Engine_Capacity = V1.Engine_Capacity();
                int Battery_Capacity = V1.Battery_Capacity();
                V1.Final_Specification(Vehicle_Int, Color_Int, Type_Int, Brakeing_System, Engine_Capacity, Battery_Capacity);
        
                int Price = P_V1.Final_Price(Vehicle_Int, Color_Int, Type_Int, Brakeing_System);
                P_V1.Display_Price(Price);
        
                Boolean Decision = E1.Exchange();
        
                if(Decision == true)
                {
                    int Color_Int_E = E1.Color();
                    int Type_Int_E = E1.Type();
                    int Brakeing_System_E = E1.Brakeing_System();
                    int Engine_Capacity_E = E1.Engine_Capacity();
                    int Battery_Capacity_E = E1.Battery_Capacity();
                    V1.Final_Specification(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E, Engine_Capacity_E, Battery_Capacity_E);
                    int Price_N = P_V1.Final_Price(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E);
                    P_V1.Display_Price(Price_N);
                    Rating R1 = new Rating(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E, Engine_Capacity_E, Battery_Capacity_E);
                    Payment P1 = new Payment();
                    int Left = P1.Paid_Amount(Price_N);
                    Process Pr = new Process();
                    Pr.Base_Model();
                    Pr.Moderate_Model();
                    Pr.Advance_Model();
                    Pr.Test();
                    Complete C1 = new Complete();
                    C1.Pay(Left);
                }
        
                else
                {
                    Rating R1 = new Rating(Vehicle_Int,Color_Int,Type_Int,Brakeing_System,Engine_Capacity,Battery_Capacity);
                    Payment P1 = new Payment();
                    int Left = P1.Paid_Amount(Price);
                    System.out.println("Your Vehicle Is Under Construction");
                    Process Pr = new Process();
                    Pr.Base_Model();
                    Pr.Moderate_Model();
                    Pr.Advance_Model();
                    Pr.Test();
                    Complete C1 = new Complete();
                    C1.Pay(Left);
                }
                
                break;
            }

            case 3:
            {
                Four_wheeler V1 = new Four_wheeler();
                Price_FOUR P_V1 = new Price_FOUR();
                Exchange_Specification E1 = new Exchange_Specification();
        
                int Vehicle_Int = V1.Vehicle_Type();
                int Color_Int = V1.Color();
                int Type_Int = V1.Type();
                int Brakeing_System = V1.Brakeing_System();
                int Engine_Capacity = V1.Engine_Capacity();
                int Battery_Capacity = V1.Battery_Capacity();
                V1.Final_Specification(Vehicle_Int, Color_Int, Type_Int, Brakeing_System, Engine_Capacity, Battery_Capacity);
        
                int Price = P_V1.Final_Price(Vehicle_Int, Color_Int, Type_Int, Brakeing_System);
                P_V1.Display_Price(Price);
        
                Boolean Decision = E1.Exchange();
        
                if(Decision == true)
                {
                    int Color_Int_E = E1.Color();
                    int Type_Int_E = E1.Type();
                    int Brakeing_System_E = E1.Brakeing_System();
                    int Engine_Capacity_E = E1.Engine_Capacity();
                    int Battery_Capacity_E = E1.Battery_Capacity();
                    V1.Final_Specification(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E, Engine_Capacity_E, Battery_Capacity_E);
                    int Price_N = P_V1.Final_Price(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E);
                    P_V1.Display_Price(Price_N);
                    Rating R1 = new Rating(Vehicle_Int, Color_Int_E, Type_Int_E, Brakeing_System_E, Engine_Capacity_E, Battery_Capacity_E);
                    Payment P1 = new Payment();
                    int Left = P1.Paid_Amount(Price_N);
                    Process Pr = new Process();
                    Pr.Base_Model();
                    Pr.Moderate_Model();
                    Pr.Advance_Model();
                    Pr.Test();
                    Complete C1 = new Complete();
                    C1.Pay(Left);
                }
        
                else
                {
                    Rating R1 = new Rating(Vehicle_Int,Color_Int,Type_Int,Brakeing_System,Engine_Capacity,Battery_Capacity);
                    Payment P1 = new Payment();
                    int Left = P1.Paid_Amount(Price);
                    System.out.println("Your Vehicle Is Under Construction");
                    Process Pr = new Process();
                    Pr.Base_Model();
                    Pr.Moderate_Model();
                    Pr.Advance_Model();
                    Pr.Test();
                    Complete C1 = new Complete();
                    C1.Pay(Left);
                }
                
                break;
            }
        
            default:
            {   
                System.out.println("Enter A Valid Choice.");
                break;
            }
        }
    }
}