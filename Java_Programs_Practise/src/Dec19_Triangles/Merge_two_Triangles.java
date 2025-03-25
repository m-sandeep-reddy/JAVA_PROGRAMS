package Dec19_Triangles;

import java.util.Scanner;

public class Merge_two_Triangles {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int r =  sc.nextInt();
		System.out.println("Enter no.of columns");
		int c =  sc.nextInt();
		
		for(int i = 1 ; i <= r ; i++)
		{
			for(int j =1 ; j<=c; j++)
			{
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j =1 ; j<=c; j++)
			{
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
