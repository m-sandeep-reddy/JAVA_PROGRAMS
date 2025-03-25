package Dec17_Patterns;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows ");
		int r =  sc.nextInt();
		System.out.println("Enter no.of columns ");
		int c =  sc.nextInt();
	
		int a = 1;
		int i =1;
		while(i<=r)
		{
			int j = 1;
			char ch = 'a';
			while(j<=c)
			{
				System.out.print(ch++ +" ");
			j++;
			}
			System.out.println();
			i++;
		}
	}

}
