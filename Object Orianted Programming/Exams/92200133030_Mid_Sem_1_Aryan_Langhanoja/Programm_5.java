/* Write a class Time with three data members to store hr, min and seconds. Create two constructors and apply checks to set valid time. 
Also create display function which displays all data members. */

class Time
{
	int hr;
	int min;
	int seconds;
	
	Time()
	{

	}

	Time(int hr,int min,int seconds)
	{
		if(seconds >= 60)
		{
			minute =  minute + 1 ;
			seconds = seconds % 60 ; 
		}
		
		else if(minute >= 60)
		{
			hr = hr + 1 ;
			minute = minute % 60 ;
		}

		public void display(int hr,int min,int seconds)
		{
			System.out.print(hr + " : " + minute + " : " + seconds)
		}
	}

}

public class Programm_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);

			Time T1 = new Time() ;

			System.out.print("Enter The Hour:-");
			T1.hr = sc.nextInt();

			System.out.print("Enter The Minute:-");
			T1.min = sc.nextInt();

			System.out.print("Enter The Seconds:-");
			T1.seconds = sc.nextInt();

			Time T2 = new Time(T1.hr,T.min,T.seconds) ;

			T2.display(T1.hr,T.min,T.seconds);
		
	}

}