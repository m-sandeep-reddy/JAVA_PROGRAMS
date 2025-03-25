package Dec11_Strings;

public class Creating_String_Object_Using_New {

	public static void main(String[] args) {
		
	/*  String s1 = new String();
		String s2 = new String();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());	*/
		
	/*	String s1 = new String("AAA");
		String s2 = new String("000");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());	*/
		
		char [] ch = {'a','b','c'};
		int [] a = {'a','b','c'};
		String s1 = new String(ch);
		String s2 = new String();
		System.out.println(s1);
		System.out.println(ch.hashCode());
		System.out.println(a.hashCode());
		System.out.println(ch);
		System.out.println(a);

	}

}
