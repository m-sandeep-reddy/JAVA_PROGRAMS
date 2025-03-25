package Alphabets;

import java.util.Scanner;

public class G {
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
				if( i == 0 && j != 0 && j != n-1 || j == 0 && i != 0 && i != n-1
					|| i == n/2 && j != 1 && j != 2 && j != 3 
					|| i == n-1 && j != 0 && j!= n-1 || j == n-1 && i >= n/2 && i != n-1)
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
