package Dec13_Strings;

import java.util.Scanner;

public class String_Into_Lowercase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string ");
		String s  =  sc.nextLine();
		
		char[] ch = s.toCharArray();
		for(int i =0 ; i<ch.length ; i++)
		{
			if(ch[i]>='A' && ch[i] <= 'Z')
				ch[i]+=32;
		}
		String s1 = new String(ch);
		System.out.println("After converting String into lowwer case"
				+ "\nthe String is ");
		System.out.println(s1);

	}

}
