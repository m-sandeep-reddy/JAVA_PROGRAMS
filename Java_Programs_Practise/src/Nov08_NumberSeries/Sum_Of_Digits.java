package Nov08_NumberSeries;

import java.util.Scanner;

public class Sum_Of_Digits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int n = sc.nextInt();
		int sum =0;
		while(n!=0) 
		{
		int res = n%10;
		sum = sum + res;
		n = n/10;
		}
		System.out.print(sum);
	}
}
