package Nov21_NumberSeries;

import java.util.Scanner;

public class Fibnocci_Upto_10Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  last value for fibnocci series");
		int n =sc.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.println(a+"\n"+b);
		
		for(int  i =1 ;i<=n-2; i++)
		{
			int sum = a+b;
			System.out.println(sum);
			a = b;
			b = sum;
		}

	}

}
