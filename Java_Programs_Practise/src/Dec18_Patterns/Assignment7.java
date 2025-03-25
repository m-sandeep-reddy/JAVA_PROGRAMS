package Dec18_Patterns;

import java.util.Scanner;

public class Assignment7 {

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
				if( i >= j)
				{
					if(i%2 == 0)
						System.out.print(a++ +" ");
					else
						System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}

	}

}
