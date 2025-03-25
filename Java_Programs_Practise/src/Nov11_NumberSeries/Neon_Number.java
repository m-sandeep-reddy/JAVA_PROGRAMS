package Nov11_NumberSeries;
import java.util.Scanner;
public class Neon_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an positive number");
		int n = sc.nextInt();
		int square = n*n;
		int sum =0;
		int rem = 0;
		
		while(square>0)
		{
			rem = square % 10;
			sum = sum + rem;
			square = square/10;
		}
		if(sum == n)
		{
			System.out.println(n+": Is a Neon Number");
		}
		else
		{
			System.out.println(n+": Is a not Neon Number");
		}
		
	}

}
