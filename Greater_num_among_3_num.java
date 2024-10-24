package Day_1_LB;

public class Greater_num_among_3_num 
{

	public static void main(String[] args) 
	{

		int num1=85;
		int num2=78;
		int num3=93;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+"is grater than among three number");
		}
		else if(num2>num3)
		{
			System.out.println(num2 +"is greater than three num");
		}
		else
		{
			System.out.println(num3+"is greater than three num");
		}
		
	}

}
