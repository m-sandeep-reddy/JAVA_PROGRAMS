package Dec19_Triangles;

import java.util.Scanner;

public class Your_Name {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int n =  sc.nextInt();int k = 1,l=1;
		while(k<=25) {
		System.out.println();k++;}
		for(int i = 0 ; i< n ; i++)
		{
			System.out.print("");
			for(int j = 0 ; j<n ; j++)
			{
				if((i==0 && j!=0) 
					|| (i ==1 && j==0)
					|| (i ==1 && j==0)
					|| (i ==n-2 && j ==n-1)
					|| (i == n/2 && j!=0 && j!=n-1)
					||(i == n-1  && j!=n-1))
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				
				if((i==0 && j ==n/2)
				|| (i ==1 && j == 1) || (i ==1 && j == n-2)
				|| (i==n/2)
				||(j==0 && i>=n/2)
				|| (j==n-1 && i>=n/2))
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				if((j==0 && i<=n-1)
				|| (i==j) || (j==n-1))
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				if(i== 0 && j!=n-1 || j == 0 ||  j == n-1 && i!=n-1 && i !=0 ||  i == n-1 && j!=n-1
						|| j ==1 && j==n-1 || j == 2 && j==n-1 || j==3 && j==n-1)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				if(i==0 || i ==n/2 || i ==n-1 || j ==0)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				if(i==0 || i ==n/2 || i ==n-1 || j ==0)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				if(j == 0 || i ==0 && j!= n-1  || i == n/2 && j != n-1 || i == 1 && j == n-1)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("      ");
			for(int j = 0 ; j<n ; j++)
			{
				if(j ==  0 || i == 0 && j != n-1 || i == n/2 && j!= n-1 || i == 1 && j == n-1 
						|| i == j && j !=1)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				if(i==0 || i ==n/2 || i ==n-1 || j ==0)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				if(i== 0 && j!=n-1 || j == 0 ||  j == n-1 && i!=n-1 && i !=0 ||  i == n-1 && j!=n-1
						|| j ==1 && j==n-1 || j == 2 && j==n-1 || j==3 && j==n-1)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			for(int j = 0 ; j<n ; j++)
			{
				if(i== 0 && j!=n-1 || j == 0 ||  j == n-1 && i!=n-1 && i !=0 ||  i == n-1 && j!=n-1
						|| j ==1 && j==n-1 || j == 2 && j==n-1 || j==3 && j==n-1)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("");
			for(int j = 0 ; j<n ; j++)
			{
				if(i==j && i<=n/2 || i +j == n-1 && j>=n/2 || j== n/2 && i>=n/2)
					System.out.print("# ");
				
				else
					System.out.print("  ");
			}
			System.out.print("  ");

			System.out.println();
		}
		while(l<=25) {
			System.out.println();l++;}
		

	}

}
