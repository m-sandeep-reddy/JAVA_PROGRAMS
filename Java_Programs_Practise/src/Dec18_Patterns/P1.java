package Dec18_Patterns;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows ");
		int r =  sc.nextInt();
		//System.out.println("Enter no.of columns ");
		//int c =  sc.nextInt();
		int space = r-1;
		int star = 1;
		
		for(int i = 1 ; i<=r ; i++)
		{
			for(int j = 1 ; j <= space ; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j <= star ; j++)
			{
				System.out.print("* ");
			}
			
			space--;
			star += 2;
			System.out.println();
		}
	}

}
