package Strings_Practise;

public class Char_Array_String_Without_Constructor {

	public static void main(String[] args) {
		
		char [] ch = {'z','o','m','a','t','o'};
		
		String s = "";
		for(int i = 0; i<ch.length ; i++)
		{
			s = s + ch[i];
		}
		
		System.out.println(s);

	}

}
