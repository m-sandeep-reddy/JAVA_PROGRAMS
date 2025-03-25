package Non_Static_M_Of_String;

public class String_To_Byte_Array {

	public static void main(String[] args) {
		
		String s = "allu ARJUN";
		
		byte [] b = s.getBytes();
		System.out.println(b);
		for(int i =0 ; i<b.length; i++)
		{
			System.out.println(b[i]);
			
		}
		byte a = 127;
		System.out.println("\n");
		for(int i =0 ; i<b.length; i++)
		{
			System.out.println(b[i]);
			b[i+1] = a++;
		}
	}

}
