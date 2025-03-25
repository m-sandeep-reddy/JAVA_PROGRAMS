package Dec13_Strings;

import java.util.Scanner;

public class Swaping_Two_Strings_Using_Temp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string ");
		String s1  =  sc.next();
		System.out.println("Enter second string ");
		String s2  =  sc.next();
		
		System.out.println("Before Swaping Strings are : ");
		System.out.println("String 1 : "+s1+"\n"+"String 2 : "+s2);
		
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("Ater swapping Strings are : ");
		System.out.println("String 1 : "+s1+"\n"+"String 2 : "+s2);
	}

}
