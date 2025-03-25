package Dec18_Patterns;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows and coloumns ");
		int n =  sc.nextInt();
	
		for(int i = 0; i<n; i++)
		{
			int a =1;
			char ch = 'a';
			for(int j =0 ; j<n ; j++)
			{
				if( i+j>=n-1)
				{	if(i%2==0)
						System.out.print(ch++ +" ");
					else
						System.out.print(a++ +" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
