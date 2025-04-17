package Dec03_Arrayss;

public class narasimha {
	public static void main(String[] args) {
		String s1=new String("REDDYS");
		String s2=new String("reddys");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		String ss1=new String("REDDYS");
		String ss2=new String("REDDYS");
		System.out.println(ss1==ss2);//false
		System.out.println(ss1.equals(ss2));//true
		System.out.println(ss1.equalsIgnoreCase(ss2));//truue
		
		String n1 = "sandeep";
		String n2 = "sandeep";
		System.out.println(n1==n2);//true
		System.out.println(n1.equals(n2));//true
	}

}
