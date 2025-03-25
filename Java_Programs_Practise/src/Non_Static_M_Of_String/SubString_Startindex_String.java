package Non_Static_M_Of_String;

public class SubString_Startindex_String {

	public static void main(String[] args) {
		
		String s = "eswarkumar";
		String a = "reddy";
		s= s+a;
		a = s.substring(0,s.length()-a.length());
		//System.out.println(a);
		System.out.println(s.substring(a.length()));
		//System.out.println(s);

	}

}
