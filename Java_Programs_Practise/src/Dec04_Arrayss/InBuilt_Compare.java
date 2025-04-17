package Dec04_Arrayss;

import java.util.Arrays;

public class InBuilt_Compare {

	public static void main(String[] args) {
		
		int [] a = {10,30,5};
		int [] b = {10,30,5};

		boolean res = Arrays.equals(a, b);
		
		if(res)
			System.out.println("Similar Arrays");
		else
			System.out.println("Not Similar Arrays");
	}
}