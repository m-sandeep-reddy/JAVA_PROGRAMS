package Dec14_Two_D_Array;

import java.util.Scanner;

public class Addition_Of_Two_Matrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows for Matrix1 ");
		int r1 = sc.nextInt();
		System.out.println("Enter no.of coloumns for Matrix1 ");
		int c1 = sc.nextInt();
		int [][] a = new int[r1][c1];

		System.out.println("Enter elemets for first matrix");
		for(int i =0; i<r1 ; i++)
		{
			System.out.println("Enter the "+c1+" integer elements for "+ i+" row");
			for(int j = 0 ; j<c1 ; j++)
			{
				a[i][j]= sc.nextInt();
			}
		}

		System.out.println("Enter elemets for second matrix");
		System.out.println("Enter no.of rows for Matrix2 ");
		int r2 = sc.nextInt();
		System.out.println("Enter no.of coloumns for Matrix2 ");
		int c2 = sc.nextInt();
		int [][] b = new int[r2][c2];

		for(int i =0; i<r2 ; i++)
		{
			System.out.println("Enter the "+c2+" integer elements for "+ i+" row");
			for(int j = 0 ; j<c2 ; j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		
		if(r1 == r2 && c1 == c2)
		{

			int[][] res = new int[r1][c2];

			for(int i =0; i<r2 ; i++)
			{
				for(int j = 0 ; j<c2 ; j++)
				{
					res[i][j]= a[i][j]+b[i][j];
				}
			}	

			System.out.println("Addition of Two Array elements are ");

			for(int i =0; i<r1 ; i++)
			{
				for(int j = 0 ; j<c1 ; j++)
				{
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Two Matrix dimensions are not equal"
					+ "\n:We cannot perform Addition");
	}

}