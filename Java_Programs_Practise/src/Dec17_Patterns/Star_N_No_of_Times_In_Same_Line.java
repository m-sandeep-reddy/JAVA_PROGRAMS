package Dec17_Patterns;

import java.util.Scanner;

public class Star_N_No_of_Times_In_Same_Line {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of times to print the star in same line ");
		int n =  sc.nextInt();
		int i =1;
		while(i<=n)
		{
			System.out.print("* ");
			i++;
		}
	}

}
