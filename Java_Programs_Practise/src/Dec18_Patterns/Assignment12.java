package Dec18_Patterns;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows ");
		int n =  sc.nextInt();
		
		int a =1;
		for(int i = 0; i<n; i++)
		{
			for(int j =0 ; j<n ; j++)
			{
				if( i<=j)
				{
					System.out.print(a%2 +" ");
				}
				else
					System.out.print("  ");
			}
			a++;
			System.out.println();
		}

	}

}
