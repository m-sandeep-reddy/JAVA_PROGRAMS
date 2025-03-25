package Nov29_Arrays;

import java.util.Scanner;

public class MergeTwoUerArrayMethods {
	public static void main(String[] args) {
		int []a = CreateArray();
		int []b = CreateArray();
		int res[] = merge(a,b);
		
		System.out.println("Merged array elments : ");
		for(int i = 0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
		
	}
	
	public static int [] CreateArray()
	{
		System.out.println("Enter no.of values for the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []a = new int[n];
		
		System.out.println("Enter "+n+" positive vlaues for the array");
		for(int i = 0;i<a.length ; i++)
		{
			a[i] = sc.nextInt();
			
		}
		return a;
	}
	public static int[] merge(int []a,int []b)
	{
		int[]res = new int[a.length+b.length];
		for(int i = 0;i<a.length ; i++)
		{
			res [i] = a[i] ;
			
		}
		for(int i = 0;i<b.length ; i++)
		{
			res [a.length+i] = b[i] ;
			
		}
		return res;
	}
	

}
