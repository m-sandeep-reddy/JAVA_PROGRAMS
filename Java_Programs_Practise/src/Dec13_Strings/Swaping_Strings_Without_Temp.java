package Dec13_Strings;

import java.util.Scanner;

public class Swaping_Strings_Without_Temp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string ");
		String s1  =  sc.next();
		System.out.println("Enter second string ");
		String s2  =  sc.next();
		
		System.out.println("Before Swaping Strings are : ");
		System.out.println("String 1 : "+s1+"\n"+"String 2 : "+s2);
		
		s1 = s1 + s2;
		s2 = s1.substring(0 , s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("Ater swapping Strings are : ");
		System.out.println("String 1 : "+s1+"\n"+"String 2 : "+s2);
	}

}
