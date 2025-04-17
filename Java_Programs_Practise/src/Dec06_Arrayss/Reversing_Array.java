package Dec06_Arrayss;

public class Reversing_Array {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,60,70};
		
		System.out.println("Before Swapping Array elements are : ");
		for(int i = 0 ; i<a.length  ; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i = 0, j = a.length-1 ; i < j ; i++,j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
		System.out.println("\nAfter Swapping Array elements are : ");
		for(int i = 0 ; i<a.length  ; i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}

/*public static void main(String[] args) {
	
	int [] a = {10,20,30,40,50,60,70,80};
	
	for(int i = a.length-1 ; i<a.length && i>=0 ; i--)
	{
		System.out.print(a[i]+" ");
	}*/