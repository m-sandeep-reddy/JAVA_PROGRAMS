package Nov21_NumberSeries;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  poitive year");
		int n =sc.nextInt();
		
		if((n %4 ==0 & n % 100  != 0 )|| n % 400 == 0)
			System.out.println(n+" is a leap year");
		else 
			System.out.println(n+" is not a leap year");

	}

}
