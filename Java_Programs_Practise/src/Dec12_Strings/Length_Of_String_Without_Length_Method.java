package Dec12_Strings;

import java.util.Scanner;

public class Length_Of_String_Without_Length_Method {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string");
		String s = sc.next();
		int count = 0;
		char [] ch = s.toCharArray();
		
		for(char a : ch) {
			count++;
		}
		System.out.println("Length of String "+s+" is : "+count);
	}
	
	/*String [] ss = s.split("");
	for(String a : ss) 	{
		System.out.println(a);
		count++;
	}*/

}

