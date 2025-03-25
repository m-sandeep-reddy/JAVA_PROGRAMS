package Nov12_NumberSeries;
import java.util.Scanner;

public class Perfect_Number 
{
	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter an positive number");
	int n = sc.nextInt();
	int sum = 0;
	for(int i =1 ; i <=n/2;i++)		// i < n
	{
		if(n%i==0)
		{
			sum = sum + i;
		}
	}
	if(sum ==n)
		System.out.println(n+" is a perfect number");
	else 
		System.out.println(n+" is not a perfect number");

	}
}