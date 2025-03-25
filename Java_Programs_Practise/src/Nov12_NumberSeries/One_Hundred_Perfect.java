package Nov12_NumberSeries;
import java.util.Scanner;

public class One_Hundred_Perfect 
{
	public static void main(String[] args) {
	
	
	for (int i = 1 ; i<=100 ; i++)
	{
		int sum =0;
		
		for(int j = 1; j<=i/2;j++)
		{
			if(i % j == 0)
				sum = sum + j;
		}
		if(sum == i)
			System.out.println(i);
		//else
			//System.out.println(i+" is  not a perfect number ");
	}


	}
}