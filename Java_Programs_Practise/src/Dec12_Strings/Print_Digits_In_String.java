package Dec12_Strings;

import java.util.Scanner;

public class Print_Digits_In_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string");
		String s = sc.next();
		
		char [] ch = s.toCharArray();
		for(int i = 0; i<ch.length ; i++)
		{
			if(ch[i] >= '0' && ch[i] <= '9')
				System.out.println(ch[i]);
		}

	}

}
