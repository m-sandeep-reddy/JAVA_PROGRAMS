package Dec17_Patterns;

import java.util.Scanner;

public class Print_N_Digits_Using_Another_Variable {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of times to print the digits in same line ");
		int n =  sc.nextInt();
		int i =1;
		while(i<=n)
		{
			System.out.print(i++ + " ");
			//i++;
		}
	}

}
