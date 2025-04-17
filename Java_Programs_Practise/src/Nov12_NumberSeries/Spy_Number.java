package Nov12_NumberSeries;

import java.util.Scanner;

public class Spy_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an positive number");
		int n = sc.nextInt();
		
		int temp = n;
		int sum = 0;
		int prod  =1;
		while(n>0)
		{
			int rem = n % 10;
			sum = sum + rem;
			prod = prod * rem;
			n = n/10;
		}
		if(prod == sum)
			System.out.println(temp+": is a spy number");
		else
			System.out.println(temp+": is not a spy number");

	}

}
