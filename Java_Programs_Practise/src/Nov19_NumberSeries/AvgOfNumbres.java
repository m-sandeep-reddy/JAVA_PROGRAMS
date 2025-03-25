 package Nov19_NumberSeries;

import java.util.Scanner;

public class AvgOfNumbres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Values");
		int n = sc.nextInt();
		
		int sum = 0;
		System.out.println("Enter "+n+" positve values");
		for(int i =1;i<=n;i++)
		{
			int j = sc.nextInt();
			sum = sum + j;
		}
		int avg = sum/n;
		System.out.println("The avg of values are : "+avg);
		

	}

}
