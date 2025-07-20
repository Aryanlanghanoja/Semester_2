public class Programm_2 
{
    public static void main(String[] args) 
    {
        int[][] arr = new int[2][5] ;
        int var = 0;
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j] = var ;
                var++;
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }    
}
