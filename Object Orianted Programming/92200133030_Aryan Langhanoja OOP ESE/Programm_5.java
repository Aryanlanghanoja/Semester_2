import java.util.*;

class Election
{
    ArrayList<String> Name = new ArrayList<>();
   // ArrayList<String> Vote = new ArrayList<>();
   int[] Vote = new int[3];

    public void AddCandidate(int num)
    {
        Scanner sc = new Scanner(System.in);
        int i=0;

        while(i<num)
        {
            String Temp = " ";

            System.out.println("Enter The Name Of A Candidate-" + (i + 1) + " :-");
            Temp = sc.next();

            Name.add(Temp);

            i++;
        }
    }

    public void CasteVote(int num)
    {
        Scanner sc = new Scanner(System.in);
        int i=0;



        for(int j=0;j<num;j++)
        {
            Vote[j] = 0;
        }

        while(true)
        {
            String Temp = " ";

            System.out.println("Enter Finish To Exit");
            Temp = sc.next();

            if(Temp.equals("Finish"))
            {
                break;
            }

            else
            {
                System.out.println(Name);

                System.out.println("Enter Your Vote:-");
                Temp = sc.next();

                if(Temp.equals(Name.get(0)))
                {
                    Vote[0]++;
                }

                else if(Temp.equals(Name.get(1)))
                {
                    Vote[1]++;
                }

                else
                {
                    Vote[2]++ ; 
                }
                // Vote.add(Temp);

                // i++;
            }
        }
    }

    public void printResult(int num)
    {
        System.out.println("Results:-\nCandidate:-\tVote:-");
        for(int i=0;i<num;i++)
        {
            System.out.println(Name.get(i) + "\t\t" + Vote[i]);
        }
    }

}

public class Programm_5 
{
    public static void main(String[] args) 
    {
        Election E = new Election();

        Scanner sc = new Scanner(System.in);


        int num = 3;
        E.AddCandidate(num);
        E.CasteVote(num);
        E.printResult(num);
    }
}
