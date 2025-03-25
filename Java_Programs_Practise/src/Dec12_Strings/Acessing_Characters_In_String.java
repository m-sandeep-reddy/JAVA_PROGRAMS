package Dec12_Strings;

public class Acessing_Characters_In_String {

	public static void main(String[] args) {
		
		String s = "java is good";
		for(int i =0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		/*char [] ch = s.toCharArray();
		for(int i =0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}*/

	}

}
