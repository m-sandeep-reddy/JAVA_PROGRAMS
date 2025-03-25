package Non_Static_M_Of_String;

public class Contains_CharSequence_String {

	public static void main(String[] args) {
		
		String s = "eclipse";
		boolean a = s.contains("el");
		boolean b = s.contains(s);
		boolean c = s.contains("ecl");
		//boolean d = s.contains('l');
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);

	}

}
