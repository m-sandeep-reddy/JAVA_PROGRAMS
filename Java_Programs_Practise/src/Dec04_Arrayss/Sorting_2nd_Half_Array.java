package Dec04_Arrayss;

import java.util.Arrays;

public class Sorting_2nd_Half_Array {

	public static void main(String[] args) {
		
		int [] a = {4,52,9,22,23,4,0,323,1,77};
		
		System.out.println("Before Sorting");
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		Arrays.sort(a, a.length/2, a.length);
		System.out.println("\nafter sorting");
		
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
