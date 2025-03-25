package Nov22_NumberSeries;

import java.util.Scanner;

public class X_To_Y_Even_Without_Loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  starting poitive number");
		int x =sc.nextInt();
		
		System.out.println("Enter an  ending poitive number");
		int y =sc.nextInt();
		
		print(x,y);
		
	}
	
	public static void print(int a , int b)
	{
		if(a>b)
			return;
		if(a % 2 == 0)
			System.out.println(a);
		a++;
		print(a,b);
	}
	

}
