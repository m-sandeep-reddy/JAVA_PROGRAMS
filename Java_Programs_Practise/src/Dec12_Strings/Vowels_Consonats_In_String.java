package Dec12_Strings;

import java.util.Scanner;

public class Vowels_Consonats_In_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string");
		String s = sc.nextLine().toLowerCase();
		
		int vowel = 0,cont=0;
		for(int i =0; i<s.length() ; i++)
		{
			char c = s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c == 'o' || c=='u')
				vowel++;
			else
				cont++;
		}
		System.out.println("count of vowels is : "+vowel);
		System.out.println("count of consonats is : "+cont);

	}

}
