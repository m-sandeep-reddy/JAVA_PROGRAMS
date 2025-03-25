package Nov11_NumberSeries;
import java.util.Scanner;
public class Swaping_Without_Temp_Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an positive number for A");
		int a = sc.nextInt();
		System.out.println("Enter an positive number for B");
		int b = sc.nextInt();
		System.out.println("before Swaping A is "+a+" B is :"+b);
		a = a + b;
		b = a - b;
		a = a - b;
		/*b = a+b;
		a = b-a;
		b = b-a;*/
		System.out.println("After  Swaping A is "+a+" B is :"+b);

	}
}