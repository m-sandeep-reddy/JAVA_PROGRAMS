package Nov28_Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,55,44};
		int sum = 0;
		
		for(int i = 0 ; i <a.length ; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("The sum of array is : "+sum);
	}

}
