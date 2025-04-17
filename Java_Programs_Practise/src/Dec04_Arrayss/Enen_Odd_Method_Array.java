package Dec04_Arrayss;

public class Enen_Odd_Method_Array {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,9,11};
		int []res = evenOdd(a);
		
		System.out.println("No.of Even Elements : "+res[0]);
		System.out.println("No.of Odd  Elements : "+res[1]);

	}

	private static int[] evenOdd(int[] a) {
		//int count = 0;
		//int count1= 0;
		int [] res = new int [2];
		for(int i = 0 ; i<a.length ; i++)
		{
			if(a[i]%2 == 0)
				res[0]++;
				//count++;
			else
				res[1]++;
				//count1++;
		}
	//	res[0]=count;
	//	res[1]=count1;
		return res;
	}

}
