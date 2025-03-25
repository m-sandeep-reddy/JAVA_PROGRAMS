package Strings_Practise;

public class Creating_String_Object_Using_Literal {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
