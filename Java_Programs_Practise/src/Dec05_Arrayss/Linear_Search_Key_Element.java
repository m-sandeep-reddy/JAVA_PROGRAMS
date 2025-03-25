package Dec05_Arrayss;

import java.util.Scanner;

public class Linear_Search_Key_Element {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] a = {3,7875,67,845,867,8,567,4};
		
		System.out.println("Enter the key element to be searched");
		int key = sc.nextInt();
		
		int count = 0;
		int index = 0;
		for(int i = 0 ; i <a.length ; i++)
		{
			if(a[i] == key)
			{
				count++;
				index = i;
				break;
			}
		}
		if(count == 1)
		{
			System.out.println("Key element '"+key+"' is found at index : "+index);
		}
	}

}
