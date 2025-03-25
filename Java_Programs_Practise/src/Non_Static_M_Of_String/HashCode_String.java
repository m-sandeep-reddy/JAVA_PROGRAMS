package Non_Static_M_Of_String;

public class HashCode_String {

	public static void main(String[] args) {
		
		String a = "java";
		String b = "sql";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		String c = "hi";
		String d = "hi";
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}

}
