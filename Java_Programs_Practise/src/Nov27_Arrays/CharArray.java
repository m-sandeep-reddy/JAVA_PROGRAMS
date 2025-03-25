package Nov27_Arrays;

import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Values for char array");
		int n = sc.nextInt();
		
		char [] a= new char[n];
		System.out.println("Enter the "+n+" char Values for the array");
		
		sc.nextLine();
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextLine().charAt(0);
			//a[i] = sc.next().charAt(0);
		}
		
		System.out.println("The char array values are:");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
