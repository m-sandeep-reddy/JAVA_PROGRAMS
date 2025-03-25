package Non_Static_M_Of_String;

public class Split_String_To_String_Array {

	public static void main(String[] args) {
		
		/*String s = "aceeekdfjfeedfb djef dfdjfdee";
		String [] a = s.split("[ejsc]",0);
		
		for(int i =0; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		System.out.println("hii");*/
		
		/*String s = " ,ab,bc,de,fg,ik,";
		String [] a = s.split(",",-1);
		
		for(int i =0; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		System.out.println("hii");*/
		
		String s = "hixyzwelecomexyztoxyzmyxyzhome";
		String [] a = s.split("xyz",0);
		
		for(int i =0; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		System.out.println("hii");
		
		/*String s = "my name is sandeep reddy presently i am studying";
		String [] a = s.split("[a \\ e \\ i \\ o \\ u]");
		
		for(int i =0; i<a.length ; i++) {
			System.out.println(a[i]+" "+i);
		}
		System.out.println("hii");*/
	}

}
