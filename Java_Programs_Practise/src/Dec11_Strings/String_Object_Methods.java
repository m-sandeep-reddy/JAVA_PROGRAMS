package Dec11_Strings;

public class String_Object_Methods {

	public static void main(String[] args) {
		String s1 = "sandeep";
		String s2 = "sandy";
		String s3 = s1;

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

	
}
