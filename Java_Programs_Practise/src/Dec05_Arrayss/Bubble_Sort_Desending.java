package Dec05_Arrayss;

public class Bubble_Sort_Desending {

	public static void main(String[] args) {
		
		int [] a = {3,475,4645,76,7457,6};
		
		System.out.println("Before sorting the Elements in the array list are");
		for(int i = 0 ; i <a.length ; i++)
			System.out.print
			(a[i]+" ");
		for(int i = 0 ; i <a.length-1 ; i++)
		{
			for(int j = 0 ; j <a.length-1 ; j++)
			{
				if(a[j] < a[j+1])
				{
					int temp = a[j];
					a[j] = a [j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting the Elements in the array list are");
		for(int i = 0 ; i <a.length ; i++)
			System.out.print
			(a[i]+" ");

	}

}
