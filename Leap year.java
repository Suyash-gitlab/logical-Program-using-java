package Day_1_LB;
import java.util.*;
public class leap_year 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println(year +" is year is leap year");
		}
		else
		{
			System.out.println(year+" is not leap year");
		}
		sc.close();
	}

}
