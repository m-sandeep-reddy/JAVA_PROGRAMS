package Dec06_Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Largest_In_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] a = {3,7875,67,845,867,8,567,4};
		System.out.println("Enter the N th largest element \nto be found in array between 1 to "+a.length);
		int max = sc.nextInt();
		
		Arrays.sort(a);
		
		if(max<=a.length)
		{
			if(max == 1)
				System.out.println("The "+max+" st largest element in the array is : "+a[a.length-1]);
			else if(max == 2 )
				System.out.println("The "+max+" nd largest element in the array is : "+a[a.length-1]);
			else if(max == 3 ||max == 4)
				System.out.println("The "+max+" rd largest element in the array is : "+a[a.length-1]);
			else
				System.out.println("The "+max+" th largest element in the array is : "+a[a.length-1]);
		}
		else
			System.out.println("Enter the range in between 1 to "+a.length+" only");
	}

}
