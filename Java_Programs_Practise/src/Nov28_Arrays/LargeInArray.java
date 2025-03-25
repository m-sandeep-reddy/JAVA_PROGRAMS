package Nov28_Arrays;

public class LargeInArray {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int []a = {1,2,3,4,4,5,55,44};
		int large = a[0];
		
		for(int i = 0 ; i <a.length ; i++)
		{
			if(a[i]>large)
			large = a[i];
		}
		System.out.println("Largest in the array is :"+large);
	}

}
