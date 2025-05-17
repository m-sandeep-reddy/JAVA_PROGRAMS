package Dec14_Two_D_Array;

import java.util.Arrays;

public class CopyingTwo2DArrays {
	public static void main(String[] args) {
		int [][] a = {{1,2},{3,4}};
		int [][] b = {{5,6},{7,8}};


		if(a.length==b.length && a[0].length == b[0].length)
		{
			int [][] c = new int[a.length+b.length][a[0].length];

			for(int i =0 ;i<a.length;i++)
			{
				for(int j =0;j<a[0].length;j++)
				{
					c[i][j]=a[i][j];
				}
			}
			
			for(int i =0 ;i<a.length;i++)
			{
				for(int j =0;j<a[0].length;j++)
				{
					c[i+a.length][j] = b[i][j];
				}
			}
			
			for(int [] i: c)
			{
				System.out.println(Arrays.toString(i));
			}
		}
	}

}
