package Nov12_NumberSeries;

import java.util.Scanner;

public class SumMethod {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		long n = sc.nextLong();
		
		System.out.println(sum(n));
	}
	
	public static long sum(long a) 
	{
		long sum = 0;
		while(a>0)
		{
			long rem  = a % 10;
			sum = sum + rem;
			a = a/10;
		}
		return sum;
	}
	

}
