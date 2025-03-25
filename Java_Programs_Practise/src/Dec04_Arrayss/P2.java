package Dec04_Arrayss;

public class P2 implements P1{
	public static void main(String[] args) {
		
		P2 obj1 = new P2();
		obj1.demo();
		P1 obj2 = obj1;
		//obj2.test();
	}
	
	public void demo()
	{
		System.out.println("demo is overriden");
	}

}
