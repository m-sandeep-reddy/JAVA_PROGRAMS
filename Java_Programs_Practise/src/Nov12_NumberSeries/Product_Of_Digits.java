package Nov12_NumberSeries;
import java.util.Scanner;

public class Product_Of_Digits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an positive number");
		int n = sc.nextInt();
		int temp = n;
		int prod =1;
		//int rem =0;
		while(n>0)
		{
			int rem = n % 10;
			prod = prod * rem;
			n = n /10;
		}
		System.out.println("Product of digits of "+temp+" is :"+prod);
	
	}
}