package Dec18_Patterns;

import java.util.Scanner;

public class Assignement__2__4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int n =  sc.nextInt();
		
		for(int i = 1 ; i <= n ;i++)
		{
			char ch = 'a';
			for(int j = 1 ; j <= n-i ; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1 ; j <= 2*i-1 ; j++)
			{
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

}
