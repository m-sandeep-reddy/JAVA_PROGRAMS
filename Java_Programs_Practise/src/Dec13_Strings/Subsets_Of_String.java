package Dec13_Strings;

import java.util.Scanner;

public class Subsets_Of_String {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String");
		
		String s = sc.next();
		
		for(int i =0 ; i<s.length() ; i++)
		{
			String out ="";
			for(int j =i ; j<s.length() ; j++)
			{
				out = out+s.charAt(j);
				System.out.println(out);
			}
		}
		
		
		
	}

}
