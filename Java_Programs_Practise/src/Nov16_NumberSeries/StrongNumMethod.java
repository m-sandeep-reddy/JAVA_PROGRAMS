package Nov16_NumberSeries;

import java.util.Scanner;

public class StrongNumMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  value to check strong no or not");
		int n =sc.nextInt();
		
		System.out.println(strong(n));
	}
	public static int strong(int n)
	{
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int fact = 1;
			int rem = n % 10;
			for(int i =1;i<=rem;i++)
			{
				fact = fact *i;
			}
			sum = sum + fact;
			n = n/10;
		}
			if(temp == sum)
				return 1;
			else
				return -1;
	}	
}
