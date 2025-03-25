package Nov08_NumberSeries;

import java.util.Scanner;

public class Print_Last_Digit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number");
		int n = sc.nextInt();
		int res = n%10;
		System.out.println(res);
	}
}
