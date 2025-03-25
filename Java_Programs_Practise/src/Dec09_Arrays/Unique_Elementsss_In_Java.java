package Dec09_Arrays;

public class Unique_Elementsss_In_Java {

	public static void main(String[] args) {
		
		int a[] = {10,40,20,50,20,40,80,40,10,90,100};
		boolean [] b = new boolean[a.length];
		System.out.println("Unique elements in the array are :");
		for(int i = 0; i<a.length ; i++)
		{
			if(b[i]==false)
			{
			int count = 1;
			for(int j = i+1 ; j<a.length ; j++)
			{
				if(a[i] == a[j])
				{
					count++;
					b[j] =true;
				}
			}
			
			if(count == 1)
			{
				System.out.print(a[i]+" ");
			}
			}
		}

	}

}
