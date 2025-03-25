package Strings_Practise;

public class String_Adress_Update {

	public static void main(String[] args) {
		
		String s = "1";
		String s1 = s;
		
		System.out.println(s == s1);
		
		s = s + "two";		
		s1 ="1"+"two";	
		
		System.out.println(s == s1);	//false
		
		s = 's' + "two";	
		s1 = "s" + "two";	
		
		System.out.println(s == s1);	//true
		
		String a = "hi";
		String b =a +"hello";
		String c ="hi" +"hello";
		
		System.out.println(a==b);
		
		b = 'a'+"bcde";
		c = "a"+"bcde";
		System.out.println(b==c);
		

	}

}
