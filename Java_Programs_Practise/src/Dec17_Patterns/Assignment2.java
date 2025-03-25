package Dec17_Patterns;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows and coloumns ");
		int n =  sc.nextInt();
		
		char ch = 'a';
		int a =1;
		for(int i = 0; i<n; i++)
		{
			for(int j =0 ; j<n ; j++)
			{
				if( j%2 == 0)
					System.out.print(ch +" ");
				else
					System.out.print(a++ + " ");
			}
			ch++;
			System.out.println();
		}

	}

}
