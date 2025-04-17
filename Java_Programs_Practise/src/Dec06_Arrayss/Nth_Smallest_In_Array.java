package Dec06_Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Smallest_In_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] a = {3,7875,67,845,867,8,567,4};
		System.out.println("Enter the N th Smallest element \nto be found in array between 1 to "+a.length);
		int min = sc.nextInt();
		
		Arrays.sort(a);
		
		if(min<=a.length)
		{
			if(min == 1)
				System.out.println("The "+min+" st Smallest element in the array is : "+a[min-1]);
			else if(min == 2 )
				System.out.println("The "+min+" nd Smallest element in the array is : "+a[min-1]);
			else if(min == 3 )
				System.out.println("The "+min+" rd Smallest element in the array is : "+a[min-1]);
			else
				System.out.println("The "+min+" th Smallest element in the array is : "+a[min-1]);
		}
		else
			System.out.println("Enter the range in between 1 to "+a.length+" only");
	}

}
