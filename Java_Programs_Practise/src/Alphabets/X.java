package Alphabets;

import java.util.Scanner;

public class X {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows and columns");
		int n = sc.nextInt();
		System.out.println("");
		
		for (int i = 0 ; i< n; i++)
		{
			System.out.print("  ");
			for (int j = 0 ; j< n; j++)
			{
				if(i == j || i+j == n-1)
				{
					System.out.print("# ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
