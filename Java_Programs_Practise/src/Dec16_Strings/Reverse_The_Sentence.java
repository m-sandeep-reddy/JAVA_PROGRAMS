package Dec16_Strings;

import java.util.Scanner;

public class Reverse_The_Sentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an sentence to reverse");
		
		String s = sc.nextLine();
		String [] sr = s.split(" ");
		String rev = "";
		for(int i =sr.length-1 ; i>= 0 ; i--)
		{
				rev = rev + sr[i] + " ";
		}
		System.out.println("After Revesing the sentence : ");
		System.out.println(rev.trim());

	}

}
