package Dec12_Strings;

public class Revesing_String {
	public static void main(String[] args) {
		
		String s = "marvel";
		String rev = "";
		for(int i = s.length() -1;i>=0 ; i--)
		{
			//char ch = s.charAt(i);
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
