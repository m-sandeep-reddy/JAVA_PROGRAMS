package Dec12_Strings;

import java.util.Scanner;

public class Print_Vowel_consonant_In_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string");
		String s = sc.nextLine();
		
		String vowel = "",cont="";
		for(int i =0; i<s.length() ; i++)
		{
			char c = s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c == 'o' || c=='u'
					|| c=='A' || c=='E' || c=='I' || c == 'O' || c=='U')
				vowel = vowel + c;
			else
				cont = cont + c;
		}
		System.out.println("vowels in "+s+" is : "+vowel);
		System.out.println("consonats in "+s+" is : "+cont);

	}

}
