package Nov29_Arrays;

import java.util.Scanner;

public class CopyCloneArray {
	public static void main(String[] args) {
		
	System.out.println("Enter no.of values for the array");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int []a = new int[n];
	
	System.out.println("Enter "+n+" positive vlaues for the array");
	for(int i = 0;i<a.length ; i++)
	{
		a[i] = sc.nextInt();
		
	}
	
	int [] copy = a.clone();
	
	System.out.println("Elements of new array are : ");
	for(int i = 0 ;i<copy.length;i++)
	{
		System.out.print(copy[i]+" ");
	}
	
	}
}
	