package Strings_Practise;

public class Char_Array_To_Sting {

	public static void main(String[] args) {
		
		char [] ch = {'s','a','n','d','y'};
		String s = new String(ch);
		String s1 = new String(ch);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(s.equals(ch));
		System.out.println(s.equals(s1));

	}

}
