package practice_program_using_iteration;
import java.util.*;
public class Armstrongnumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int n=sc.nextInt();
 
		int count=0;
		int num=n;
		while(n!=0)
		{
			n/=10;
			count++;
		}		
		System.out.println("Count of number is :"+count);


		double ans=0;
		int rem,temp;
		temp=n;
		while(temp>0)
		{
			rem=temp%10;
			ans=ans+Math.pow(rem, count);
			temp=temp/10;
		}
		if(ans==n) {
			System.out.println("Num is Armstrong");
		}
		else {
			System.out.println("Num is Not Armstrong");

		}
		sc.close();

	}

}


