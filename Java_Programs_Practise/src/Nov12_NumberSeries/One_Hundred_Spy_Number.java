package Nov12_NumberSeries;

import java.util.Scanner;

public class One_Hundred_Spy_Number {

	public static void main(String[] args) {
		//int i =1;
		//while(i<=100)
		for(int i =1;i<=100;i++)
		{
			int temp = i;
			int j =i;
			int sum =0;
			int prod =1;
			while(j>0)
			{
				int rem = j % 10;
				sum = sum + rem;
				prod = prod * rem;
				j = j/10;
			}
			if(prod == sum)
			{
				System.out.println(temp+": is a spy number");
			}
		
		}

	}

}
