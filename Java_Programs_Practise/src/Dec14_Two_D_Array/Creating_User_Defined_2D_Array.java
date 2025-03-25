package Dec14_Two_D_Array;

import java.util.Scanner;

public class Creating_User_Defined_2D_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows for Matrix ");
		int r = sc.nextInt();
		System.out.println("Enter no.of coloumns for Matrix ");
		int c = sc.nextInt();
		int [][] a = new int[r][c];
		
		System.out.println("Enter "+r*c+" integer elements for the matrix");
		for(int i =0; i<r ; i++)
		{
			System.out.println("Enter the elements for "+ i+" row elements");
			for(int j = 0 ; j<c ; j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Array elements are ");
		for(int i =0; i<r ; i++)
		{
			for(int j = 0 ; j<c ; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
