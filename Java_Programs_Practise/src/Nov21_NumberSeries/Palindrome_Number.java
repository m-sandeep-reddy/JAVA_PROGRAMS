package Nov21_NumberSeries;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an  poitive number");
		int n =sc.nextInt();
		
		int temp = n;
		int rev = 0;
		while(n>0) 
		{
			int rem = n %10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		if(temp == rev)
			System.out.println(temp+" is a palindrome number");
		else
			System.out.println(temp+" is not a palindrome number");
	}

}
