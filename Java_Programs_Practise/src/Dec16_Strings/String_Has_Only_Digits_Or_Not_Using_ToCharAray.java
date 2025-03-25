package Dec16_Strings;

import java.util.Scanner;

public class String_Has_Only_Digits_Or_Not_Using_ToCharAray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String to check it has  "
				+ "\nonly digits or not");
		String s = sc.next();
		char [] ch = s.toCharArray();
		int count  =1;
		for(int i = 0; i<ch.length ; i++)
		{
			if(ch[i] >= '0' && ch[i] <= '9') {}
			else {
				count++;
				break;
			}	
		}
		if(count == 1)
			System.out.println("String contains only digits");
		else
			System.out.println("String contains elements other than digits");

	}

}
