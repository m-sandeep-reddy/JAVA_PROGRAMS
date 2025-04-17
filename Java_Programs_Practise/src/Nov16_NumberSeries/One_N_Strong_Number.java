package Nov16_NumberSeries;

import java.util.Scanner;

public class One_N_Strong_Number {
	public static void main(String[] args) {
		
		System.out.println("Enter an last value to check strong or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			int temp = i;
			int num = i;
			int sum = 0;
			while(num>0)
			{
				int fact = 1;
				int rem = num % 10;
				
				for(int j=1;j<=rem;j++)
				{
					fact = fact *j;
				}
				
				sum = sum + fact;
				num = num/10;
			}
			
			if(temp == sum)
			{
				System.out.println(i+" is strong number");
			}
		}
		
	}

}
