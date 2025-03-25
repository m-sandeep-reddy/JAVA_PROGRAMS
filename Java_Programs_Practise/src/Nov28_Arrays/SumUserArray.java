package Nov28_Arrays;

import java.util.Scanner;

public class SumUserArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Values for the int array");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter "+n+" +ve values for the array");
		
		for(int i = 0 ; i <a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i<a.length ; i++)
		{
			if(a[i]%2==0)
				sum = sum + a[i];
		}
		
		System.out.println("The sum of array elements is : "+sum);
	}

}
