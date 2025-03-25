package Dec16_Strings;

import java.util.Scanner;

public class String_Has_Only_Digits_Or_Not_Using_Parseint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String to check it has  "
				+ "\nonly digits or not");
		String s = sc.next();
		try {
		int a = Integer.parseInt(s);
		System.out.println("String contains only digits");
		}
		catch(Exception e) {
		System.out.println("String contains elements other than digits");
		}

	}

}
