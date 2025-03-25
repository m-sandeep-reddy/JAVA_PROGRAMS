package Dec17_Patterns;

import java.util.Scanner;

public class P16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.of rows ");
		int r =  sc.nextInt();
		System.out.println("Enter no.of columns ");
		int c =  sc.nextInt();
		
		char ch = 'a';
		int a = 1;
		int i =0;
		
		while(i<r)
		{
			int j = 0;
			while(j<c)
			{
				if(j == 0)
					System.out.print("* ");
				else
					System.out.print("- ");
			j++;
			}
			System.out.println();
			i++;
		}
	}

}
