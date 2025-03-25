package Nov27_Arrays;

import java.util.Scanner;

public class DoubleArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Values for double array");
		int n = sc.nextInt();
		
		double [] a= new double[n];
		System.out.println("Enter the "+n+" Values for the array");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextDouble();
		}
		System.out.println("The double array values are:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
