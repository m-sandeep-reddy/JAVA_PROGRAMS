package Dec18_Patterns;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows and coloumns ");
		int n =  sc.nextInt();
		
		int a =1;
		for(int i = 0; i<n; i++)
		{
			char ch = 'a';
			for(int j =0 ; j<n ; j++)
			{
				if( i+j>=n-1)
					System.out.print(ch++ +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
