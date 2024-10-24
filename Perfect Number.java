package Day_1_LB;
import java.util.*;
//perfect number is sum of its divisor is equal to number itself
public class Perfect_number 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the number :");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}	
		}
		
		if(num==sum)
		{
			System.out.println("The "+num+" is perfect number");
		}
		else
		{
			System.out.println("The "+num+" is not a perfect number");

		}
		
		sc.close();
	}
	

}
