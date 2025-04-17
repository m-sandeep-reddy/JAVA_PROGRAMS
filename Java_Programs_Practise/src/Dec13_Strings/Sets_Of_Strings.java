package Dec13_Strings;

import java.util.Scanner;

public class Sets_Of_Strings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String");
		
		String s = sc.next();
		String out = "";
		for(int i =0 ; i<s.length() ; i++)
		{
			out = out+s.charAt(i);
			System.out.println(out);
		}
		
		
		
	}

}
