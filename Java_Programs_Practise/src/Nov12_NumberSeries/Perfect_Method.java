package Nov12_NumberSeries;
import java.util.Scanner;

public class Perfect_Method 
{
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an positive number");
	int n = sc.nextInt();
	System.out.println(perfect(n));
	//perfect(n);
	
	}
	public static String perfect(int a)
	{
		int sum = 0;
		for(int i =1 ; i <=a/2;i++)		// i < a
		{
			if(a % i == 0)
			{
				sum = sum + i;
			}
		}
	
		if(sum ==a)
			return a+" is a perfect number";
		else 
			return a+" is not a perfect number";


	}
}