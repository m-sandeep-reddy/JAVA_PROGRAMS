package Dec16_Strings;

import java.util.Scanner;

public class Each_Word_First_Letter_To_Uppercae {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Sentence to conver every word to uppercae");
		
	String s = sc.nextLine();
	String [] arr = s.split(" ");
	String capital = "";
	for(int i =0 ; i<arr.length ; i++)
	{
		char [] ch = arr[i].toCharArray();
		if(ch[0]>='a' && ch[0]<='z')
			ch[0] -=  32;
		String res = new String(ch);
		capital = capital+res+ " ";
	}
	System.out.println("After converting every word intial into Uppercase");
	System.out.println(capital.trim());
	
	}

}
