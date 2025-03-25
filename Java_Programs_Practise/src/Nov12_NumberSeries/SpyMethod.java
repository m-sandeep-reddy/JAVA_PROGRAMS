package Nov12_NumberSeries;

import java.util.Scanner;

public class SpyMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  value to check spy no or not");
		int n =sc.nextInt();
		
		System.out.println(spy(n));
	}
	public static String spy(int j)
	{
		int sum = 0;
		int prod = 1;
		while(j>0)
		{
			int rem = j % 10;
			sum = sum + rem;
			prod = prod * rem;
			j = j/10;
		}
		
			if(prod == sum)
			{
				return "true";
				//System.out.println(temp+": is a spy number");
			}
			else
				return "false";
		
	}	
}
