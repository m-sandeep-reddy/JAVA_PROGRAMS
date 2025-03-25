package Nov16_NumberSeries;

import java.util.Scanner;

public class X_Power_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base value ");
		int x = sc.nextInt();
		System.out.println("Enter the power value ");
		int y = sc.nextInt();
		int power =1;
		
		for(int i =1;i<=y;i++)
		{
			power = power*x;
		}
		System.out.println(x+" power "+y+" is: "+power);

	}

}
