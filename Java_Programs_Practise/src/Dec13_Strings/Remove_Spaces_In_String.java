package Dec13_Strings;

import java.util.Scanner;

public class Remove_Spaces_In_String {
	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first string ");
			String s1 = sc.nextLine();
			String s2 = "";
			char [] ch = s1.toCharArray();
			for(int i =0;i<s1.length();i++)
			{
				if(ch[i] != ' ' || ch[i] != 32)
				{
					s2 = s2+ch[i];
				}
			}
			System.out.println(s2);
	}

}
