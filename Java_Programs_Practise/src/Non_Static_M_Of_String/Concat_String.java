package Non_Static_M_Of_String;

public class Concat_String {

	public static void main(String[] args) {
		
		String s = "java";
		String a = "java".concat(" sql").concat(" manual");
		String b = a.concat(" sql").concat(" manual");
		
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);

	}

}
