package Nov22_NumberSeries;

import java.util.Scanner;

public class Factorial_Without_Loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an poitive number");
		int x =sc.nextInt();
	
		print(x,1);
	}
	
	public static void print(int a , int fact)
	{
		if(a == 0)		// a == 1
		{
			System.out.println(fact);
			return;
		}
		fact = fact * a;
		a--;
		print(a,fact);
		
	}
	

}
