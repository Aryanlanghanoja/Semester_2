import java.util.Random;

class RandomNumberGenerator implements Runnable 
{
    public void run() 
    {
        Random random = new Random();
        int num = 0 ;
        while (num < 10 ) 
        {
            int number = random.nextInt(100);
            System.out.println("Generated number: " + number);

            if (number % 2 == 0) 
            {
                Thread squareThread = new Thread(new SquareCalculator(number));
                squareThread.start();
            } 
            
            else 
            {
                Thread cubeThread = new Thread(new CubeCalculator(number));
                cubeThread.start();
            }

            try 
            {
                Thread.sleep(1000);
            } 
            
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }

            num ++ ;
        }
    }
}

class SquareCalculator implements Runnable 
{
    private int number;

    public SquareCalculator(int number) 
    {
        this.number = number;
    }

    public void run() 
    {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

class CubeCalculator implements Runnable 
{
    private int number;

    public CubeCalculator(int number) 
    {
        this.number = number;
    }

    public void run() 
    {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

public class Table 
{
    public static void main(String[] args) 
    {
        Thread generatorThread = new Thread(new RandomNumberGenerator());
        generatorThread.start();
    }
}
