package Nov08_NumberSeries;

import java.util.Scanner;

public class Print_Last_To_First
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int n = sc.nextInt();
		while(n>0) 
		//for (;n>0;)
		{
		int res = n%10;
		System.out.print(res);
		n = n/10;
		}
	}
}
