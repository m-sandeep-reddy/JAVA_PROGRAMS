package Dec14_Two_D_Array;

import java.util.Scanner;

public class Even_Elements_In_2D_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows for Matrix ");
		int r = sc.nextInt();
		System.out.println("Enter no.of coloumns for Matrix ");
		int c = sc.nextInt();
		int [][] a = new int[r][c];
		
		for(int i =0; i<r ; i++)
		{
			System.out.println("Enter the "+c+" integer elements for "+ i+" row");
			for(int j = 0 ; j<c ; j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Even elements in Matrix are :");
		for(int i =0; i<r ; i++)
		{
			for(int j = 0 ; j<c ; j++)
			{
				if(a[i][j]%2 ==0)
					System.out.print(a[i][j]+" ");
			}
		}

	}

}
