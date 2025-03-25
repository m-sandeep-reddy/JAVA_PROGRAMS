package Dec12_Strings;

public class Palindrome_String {
	public static void main(String[] args) {
		
		String s = "mom";
		String rev = "";
		
		for(int i = s.length() -1;i>=0 ; i--)
		{
			//char ch = s.charAt(i);
			rev = rev + s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
			System.out.println(s+" is a Palindrome");
		else
			System.out.println(s+" Not a Palindrome");
	}

}
