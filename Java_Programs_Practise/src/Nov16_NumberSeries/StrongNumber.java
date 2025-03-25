package Nov16_NumberSeries;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter an positive number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int fact = 1;
			int rem = n % 10;
			for(int i =rem;i>0;i--)
			{
				fact = fact *i;
			}
			sum = sum + fact;
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println(temp+": is an strong Number ");
		}
		else
			System.out.println(temp+": is not an strong Number ");
		

	}

}
