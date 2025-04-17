package Non_Static_M_Of_String;

public class Equals_String {

	public static void main(String[] args) {
		
		String a = "sandy";
		String b = "sandy";
		String c = new String("sandy");
		
		System.out.println(a.equals(b));
		System.out.println(a==b);
		
		System.out.println(a.equals(c));
		System.out.println(a==c);

	}

}
