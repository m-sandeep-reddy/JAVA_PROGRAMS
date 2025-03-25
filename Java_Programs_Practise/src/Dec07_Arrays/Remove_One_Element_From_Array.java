package Dec07_Arrays;

import java.util.Scanner;

public class Remove_One_Element_From_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {1,2,3,4,5,6};
		System.out.println("Enter the index no for removing");
		int index = sc.nextInt();
		
		if(index < 0 || index >=a.length)
		{
			System.out.println("Enter index in between 0 to "+(a.length-1)+" only");
			System.out.println("Array Index Out OF Bound Exception\n");
		}
		else {
		int res[] = remove(a,index);
		System.out.println("Before Remooving the element into array");
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nAfter Removing the element into array");
		for(int i = 0 ; i<res.length ; i++)
		{
			System.out.print(res[i]+" ");
		}}

	}
	public static int[] remove(int [] a, int index)
	{
		if(index < 0 || index >=a.length)
		{
			System.out.println("Array Index Out OF Bound Exception\n");
			return a;
		}
		int [] res = new int[a.length-1];
		for(int i = 0 ; i<res.length ; i++)
		{
			if(i<index)
			{
				res[i] = a[i];
			}
			else
				res[i] = a[i+1];
		}
		return res;
	}
}