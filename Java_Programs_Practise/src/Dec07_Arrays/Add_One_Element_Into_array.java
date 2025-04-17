package Dec07_Arrays;

import java.util.Scanner;

public class Add_One_Element_Into_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {1,2,3,4,5,6}; 
		System.out.println("Enter the index no for adding");
		int index = sc.nextInt();
		System.out.println("Enter and element to be added");
		int element = sc.nextInt();
		if(index < 0 || index >=a.length)
		{
			System.out.println("Enter index in between 0 to "+(a.length-1)+" only");
			System.out.println("Array Index Out OF Bound Exception\n");
		}
		else {
			int res[] = add(a,index,element);
			System.out.println("Before adding the element into array");
			for(int i = 0 ; i<a.length ; i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println("\nAfter adding the element into array");
			for(int i = 0 ; i<res.length ; i++)
			{
				System.out.print(res[i]+" ");
			}}

	}
	public static int[] add(int [] a, int index, int element)
	{
	
		int [] res = new int[a.length+1];
		for(int i = 0 ; i<a.length ; i++)
		{
			res[index] = element;
			if(i<index)
			{
				res[i] = a[i];
			}
			else
				res[i+1] = a[i];
		}
		return res;
	}
}