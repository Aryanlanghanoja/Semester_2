interface VehicleInterface
{
    int a =  10 ;
    public void turnLeft() ;
    public void turnRight() ;
    public void accelarte() ;
    public void slowDown() ;
}

class CarClass implements VehicleInterface
{
    public void turnLeft()
    {
        System.out.println("Left");
    }

    public void turnRight()
    {
        System.out.println("Right");
    }

    public void accelarte()
    {
        System.out.println("Speed");
    }

    public void slowDown()
    {
        System.out.println("Brake");
    }
}

public class Interface 
{
    public static void main(String[] args) 
    {
        CarClass c = new CarClass();
        c.turnLeft() ;    
    }    
}




