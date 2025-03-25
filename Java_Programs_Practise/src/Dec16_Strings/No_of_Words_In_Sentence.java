package Dec16_Strings;

import java.util.Scanner;

public class No_of_Words_In_Sentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an sentence to reverse");
		
		String s = sc.nextLine();
		String [] arr = s.split(" ");
		System.out.println("No.of words is : "+arr.length);

	}

}
