package Dec17_Patterns;

import java.util.Scanner;

public class Print_N_Alpha_Using_Another_Variable2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of times to print the alphabets in same line ");
		int n =  sc.nextInt();
		char ch = 'a';
		int i =1;
		while(i<=n)
		{
			System.out.print(ch++ + " ");
			i++;
		}
	}

}
