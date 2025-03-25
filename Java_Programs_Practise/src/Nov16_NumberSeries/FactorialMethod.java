package Nov16_NumberSeries;

import java.util.Scanner;

public class FactorialMethod {

	public static void main(String[] args) {
		System.out.println("Enter an positive number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fact(n));

	}

	private static int fact(int n) {
		int fact = 1;
		while(n>0)
		{
			//int rem = n %10;
			fact = fact * n;
			n--;
		}
		
		return fact;
	}

}
