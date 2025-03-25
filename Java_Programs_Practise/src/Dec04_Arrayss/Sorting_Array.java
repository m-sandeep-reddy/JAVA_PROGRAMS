package Dec04_Arrayss;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		
		int [] a = {4,52,9,2223,4,0,323};
		
		System.out.println("Before sorting");
		
		for(int i = 0 ; i<a.length ; i++)
		{	
			System.out.print(a[i]+" ");
		}

		Arrays.sort(a);
		
		System.out.println("\nAfter sorting");
		for(int i = 0 ; i<a.length ; i++)
		{	
			System.out.print(a[i]+" ");
		}

	}

}
