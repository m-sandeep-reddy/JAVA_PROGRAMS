package Dec14_Two_D_Array;

import java.util.Scanner;

public class Sum_Of_Elements_In_2D_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows for Matrix ");
		int r = sc.nextInt();
		System.out.println("Enter no.of coloumns for Matrix ");
		int c = sc.nextInt();
		int [][] a = new int[r][c];
		int sum = 0;
		
		for(int i =0; i<r ; i++)
		{
			System.out.println("Enter the "+c+" integer elements for "+ i+" row");
			for(int j = 0 ; j<c ; j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		
		for(int i =0; i<r ; i++)
		{
			for(int j = 0 ; j<c ; j++)
			{
				sum = sum + a[i][j];
			}
		}
		System.out.println("Sum of elements in Matrix are : "+sum);

	}

}
