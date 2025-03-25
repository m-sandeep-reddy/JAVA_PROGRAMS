package Dec16_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String_Or_Not {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings for Anagram comparision");
		System.out.println("Enter the first String ");
		String s1 = sc.next().toUpperCase();
		System.out.println("Enter the second String");
		String s2 = sc.next().toUpperCase();
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a,b))
			System.out.println("Given Two Strings "+s1+" "+s2+" Are Anagram Strings");
		else
			System.out.println("Given Two Strings Are Not Anagram Strings");
			
			

	}

}
