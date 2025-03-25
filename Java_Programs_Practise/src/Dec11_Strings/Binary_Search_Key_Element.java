package Dec11_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_Key_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = {10,30,50,20,40,80,60,70,90};
		Arrays.sort(a);
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		int count = 0;
		int index = 0;
		int low = 0;
		int high = a.length-1;
		
		for(   ; low<=high ;    )
		{
			int mid = (low+high)/2;
			if(key  == a[mid])
			{
				index = mid;
				count++;
				break;
			}
			else if(key < a[mid])
				high = mid - 1;
			else if(key > a[mid])
				low  = mid + 1;	
		}
		if(count == 1)
			System.out.println("Key element "+key+" is found at index: "+index);
		else
			System.out.println("Key element is not found");
		

	}

}
