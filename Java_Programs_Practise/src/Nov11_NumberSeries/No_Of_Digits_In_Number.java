package Nov11_NumberSeries;
import java.util.Scanner;
public class No_Of_Digits_In_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an positive number");
		int n = sc.nextInt();
		int count = 0;
		//while(n>0)
		for(;n>0;)
		{
			n = n /10;
			count++;
		}
		System.out.println("no.of digits in the given number is :"+count);


	}

}
