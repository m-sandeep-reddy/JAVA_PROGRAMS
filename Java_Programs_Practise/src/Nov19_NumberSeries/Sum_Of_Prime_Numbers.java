package Nov19_NumberSeries;

import java.util.Scanner;

public class Sum_Of_Prime_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\"Enter the last no for prime number\"");
		int n =  sc.nextInt();
		int sum=0;
		for(int j =1 ; j <=n ; j++)
		{
			int count = 0;
			for(int i = 2 ; i <= j/2 ; i++)
			{
				if(j%i==0)
				{
					count++;
					break;
				}
			}
			if(count == 0 && j !=1)
				sum = sum + j;
			
		}
	
		System.out.println("Sum of prime numbers from 1 to "+n+" is :"+sum);

	}

}
