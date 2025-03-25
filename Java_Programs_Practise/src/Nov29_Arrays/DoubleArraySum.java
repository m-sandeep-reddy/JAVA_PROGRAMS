package Nov29_Arrays;

import java.util.Scanner;

public class DoubleArraySum {
	public static void main(String[] args) {
		
		System.out.println("Enter no.of values for the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double []a = new double[n];
		
		System.out.println("Enter "+n+" +ve price vlaues for the array");
		for(int i = 0;i<a.length ; i++)
		{
			a[i] = sc.nextDouble();
			
		}
		double sum = 0;
		for(int i = 0;i<a.length ; i++)
		{
			sum = sum + a[i];
			
		}
		System.out.println("Sum of Array elements is : "+sum);
		
	}

}
