package Nov22_NumberSeries;

import java.util.Scanner;

public class X_To_Y_Sum_Without_Loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  starting poitive number");
		int x =sc.nextInt();
		
		System.out.println("Enter an  ending poitive number");
		int y =sc.nextInt();
		int sum =0;
		
		print(x,y,sum);
		
	}
	
	public static void print(int a , int b , int sum)
	{
		if(a>b)
		{
			System.out.println(sum);
			return ;
		}
		sum = sum + a;
		a++;
		print(a,b,sum);
	}
	

}
