package Nov22_NumberSeries;

public class Numbers_Print_Without_Loops {

	public static void main(String[] args) {
		print(1,10);
		
	}
	
	public static void print(int a , int b)
	{
		if(a>b)
			return;
		System.out.println(a++);
		print(a,b);
	}
	

}
