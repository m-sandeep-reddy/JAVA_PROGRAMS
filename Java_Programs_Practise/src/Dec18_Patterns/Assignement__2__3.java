package Dec18_Patterns;

import java.util.Scanner;

public class Assignement__2__3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int n =  sc.nextInt();
		
		for(int i = 1 ; i <= n ;i++)
		{
			int a = 1;
			for(int j = 1 ; j <= n-i ; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1 ; j <= 2*i-1 ; j++)
			{
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}

}
