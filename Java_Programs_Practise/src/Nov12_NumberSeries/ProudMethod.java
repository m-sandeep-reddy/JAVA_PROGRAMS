package Nov12_NumberSeries;

import java.util.Scanner;

public class ProudMethod {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n = sc.nextInt();
		
		System.out.println(prod(n));
	}
	
	public static int prod(int a) 
	{
		int prod = 1;
		while(a>0)
		{
			int rem  = a % 10;
			prod = prod * rem;
			a = a/10;
		}
		return prod;
	}
	

}
