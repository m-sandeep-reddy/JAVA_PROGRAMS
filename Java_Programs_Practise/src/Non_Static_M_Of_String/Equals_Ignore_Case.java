package Non_Static_M_Of_String;

public class Equals_Ignore_Case {

	public static void main(String[] args) {
		
		String s = "saNdeeP";
		String a = "sandeep";
		
		System.out.println(s.equals(a));
		System.out.println(s.equalsIgnoreCase(a));
		System.out.println(s.contentEquals(s));

	}

}
