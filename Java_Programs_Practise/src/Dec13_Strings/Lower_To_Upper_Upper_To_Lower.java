package Dec13_Strings;

import java.util.Scanner;

public class Lower_To_Upper_Upper_To_Lower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string ");
		String s  =  sc.nextLine();
		
		char[] ch = s.toCharArray();
		for(int i =0 ; i<ch.length ; i++)
		{
			if(ch[i]>='A' && ch[i] <= 'Z')
				ch[i]+=32;
			else if(ch[i]>='a' && ch[i] <= 'z')
				ch[i]-=32;
			
		}
		String s1 = new String(ch);
		System.out.println("After converting String Upper to lower and Lower to Upper");
		System.out.println(s1);

	}

}
