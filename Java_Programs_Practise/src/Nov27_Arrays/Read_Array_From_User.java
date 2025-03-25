package Nov27_Arrays;

import java.util.Scanner;

public class Read_Array_From_User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Values for int array");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		System.out.println("Enter the "+n+" +ve values for the int array");
		
		for(int i = 0; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Entered array elements are :");
		for(int i = 0; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
