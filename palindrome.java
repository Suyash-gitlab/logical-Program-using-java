package practice_program_using_iteration;
import java.util.*;
public class palindrome {
	
		//121=121 true
		//992=299 false
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n=sc.nextInt();
		int rev=0,temp,rem;
		temp=n;
		
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;	
		}
		
		
		if(n==rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is  not Palindrome");
		}
		sc.close();
	}

}
