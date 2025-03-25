package Nov11_NumberSeries;
import java.util.Scanner;
public class Swap_Using_Temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an positive number for A");
		int a = sc.nextInt();
		System.out.println("Enter an positive number for B");
		int b = sc.nextInt();
		System.out.println("before Swaping A is "+a+" B is :"+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After  Swaping A is "+a+" B is :"+b);

	}
}