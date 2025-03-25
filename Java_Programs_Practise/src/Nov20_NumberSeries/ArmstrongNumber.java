package Nov20_NumberSeries;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  value to check Armstrong no or not");
		int n =sc.nextInt();
		
		int temp =n;
		int temp1 = n;
		int count =0;
		
		while(temp>0) 
		{
			temp = temp/10;
			count++;
		}
		
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			int prod = 1;
			for(int i=1; i<=count; i++)
			{
				prod = prod *rem;
			}
			sum = sum +prod;
			n = n / 10;
		}
		
		if(temp1==sum)
			System.out.println(temp1+" is a armstrong number");
		else
			System.out.println(temp1+" is not a armstrong number");
		

	}

}
