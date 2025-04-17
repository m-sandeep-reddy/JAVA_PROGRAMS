package Dec13_Strings;

import java.util.Scanner;

public class Replacing_Char_In_String_Using_Built_In_Method {
	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string ");
			String s1 = sc.nextLine();
			char ch ='s';
			String k = "k";

			s1 = s1.replace('a', ch);
			System.out.println(s1);
			s1 = s1.replace("b", "BBB");
			System.out.println(s1);
			
			s1 = s1.replaceAll("s", "aaaa");
			System.out.println(s1);
	}

}
