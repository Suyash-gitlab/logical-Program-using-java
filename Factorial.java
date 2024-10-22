package practice_program_using_iteration;
import java.util.*;
public class Factorial {

	//if number is 5 then 5*4*3*2*1=120;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=sc.nextInt();
		
		int fact=1,i;
		for( i=1;i<=num;i++)
		{
			 fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is :"+fact);
		
		sc.close();
		 
	}

}
