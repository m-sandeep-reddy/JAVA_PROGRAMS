package Dec16_Strings;

import java.util.Scanner;

public class Reverse_Every_Word_And_Reversing_Sentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an sentence to reverse");
		
		String s = sc.nextLine();
		String [] arr = s.split(" ");
		String out = "";
		for(int i =arr.length-1 ; i>= 0 ; i--)
		{
			char [] ch = arr[i].toCharArray();
			for(int j = ch.length-1 ; j>=0 ; j--)
			{
				out = out+ch[j];
			}
			out = out + " ";
		}
		System.out.println("After Revesing every word in the sentence : ");
		System.out.println(out.trim());
	}

}
