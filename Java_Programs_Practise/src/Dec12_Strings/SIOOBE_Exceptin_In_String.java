package Dec12_Strings;

public class SIOOBE_Exceptin_In_String {

	public static void main(String[] args) {
		String  s = "hi";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		//System.out.println(s.charAt(2));		//SIOOBE index = length()
		//System.out.println(s.charAt(-1));		//SIOOBE index < length()
		//System.out.println(s.charAt(5));		//SIOOBE index > length()
	}

}
