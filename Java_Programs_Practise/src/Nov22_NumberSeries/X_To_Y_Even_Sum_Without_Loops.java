package Nov22_NumberSeries;

import java.util.Scanner;

public class X_To_Y_Even_Sum_Without_Loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  starting poitive number");
		int x =sc.nextInt();
		
		System.out.println("Enter an  ending poitive number");
		int y =sc.nextInt();
		int sum =0;
		int temp = x;
		print(x,y,sum,temp);
		
	}
	
	public static void print(int a , int b , int sum , int temp)
	{
		if(a>b)
		{
			System.out.println("sum of even no from "+temp+" to "+b+" is :"+sum);
			return ;
		}
		if(a % 2 == 0)
		{
			sum = sum + a;
		}
		a++;
		print(a,b,sum,temp);
	}
	

}
