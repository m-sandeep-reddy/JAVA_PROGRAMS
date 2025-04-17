package Nov29_Arrays;

public class Copying_Using_Clone {

	public static void main(String[] args) {
		
		int a [] = {10,20,30,40};
		int b[] = a.clone();
		
		for(int i =0; i<b.length ; i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
