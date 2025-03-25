package Nov12_NumberSeries;
import java.util.Scanner;

public class Count_Of_Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an positive number");
		int n = sc.nextInt();
		
		int count =0;
		//int i =1;
		//while(i<=n) 
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)
			{
				//System.out.println(i);
				count++;
			}
			//i++;
		}
		System.out.println("No of factors for "+n+" is "+count );
		

	}

}
