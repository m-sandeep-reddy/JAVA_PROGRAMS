package Nov19_NumberSeries;

import java.util.Scanner;

public class One_To_N_Prime_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last no for prime number");
		int n =  sc.nextInt();
	
		for(int j =1 ; j <=n ; j++)
		{
			int count = 0;
			for(int i = 2 ; i <= j/2 ; i++)
			{
				if(j%i==0)
				{
					count++;
					break;
				}
			}
			if(count == 0 && j !=1)
				System.out.println(j);
			
		}

	}

}
