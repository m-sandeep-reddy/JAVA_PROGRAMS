package Dec18_Patterns;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows ");
		int r =  sc.nextInt();
		
		for(int i = 1 ; i<=r ; i++)
		{
			for(int j = 1 ; j <= r-i ; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1 ; j <= 2*i-1 ; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
