package Dec06_Arrayss;

import java.util.Scanner;

public class Nth_Largest_Without_Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] a = {35,25,45,50,40,20,30,10};
		
		System.out.println("Enter the N th largest element \nto be found in array between 1 to "+a.length);
		int max = sc.nextInt();
		
		for(int i = 0 ; i<a.length ; i++)
		{
			int count = 0;
			for(int j =0 ; j<a.length ; j++)
			{
				if(a[i] < a[j])
				{
					count++;
				}	
			}
			if(count == max -1)
			{
				System.out.println("The "+max+" larget element is "+a[i]);
				break;
			}
		}
		
		

	}

}
