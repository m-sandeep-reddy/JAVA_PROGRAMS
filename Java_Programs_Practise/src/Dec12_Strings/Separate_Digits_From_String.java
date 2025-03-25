package Dec12_Strings;

import java.util.Scanner;

public class Separate_Digits_From_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string");
		String s = sc.next();
		
		String out = "";
		char [] ch = s.toCharArray();
		for(int i = 0; i<ch.length ; i++)
		{
			if(ch[i] >= '0' && ch[i] <= '9')
				out = out + ch[i];
		}
		System.out.println("After separating digits in the array are");
		System.out.println(out);
	}

}
