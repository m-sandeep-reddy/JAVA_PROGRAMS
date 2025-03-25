package Dec09_Arrays;

public class Frequency_Of_Elements_In_Array {

	public static void main(String[] args) {
		int [] a= {10,20,20,30,40,50,10,20,80,80,30,10};
		boolean [] b = new boolean[a.length];
		
		for(int i = 0 ; i<a.length ; i++)
		{
			int count = 1;
			if(b[i]== false)
			{
				for(int j = i+1;j<b.length; j++)
				{
					if(a[i] ==a[j])
					{
						count++;
						b[j] = true;
					}
				}
				System.out.println(a[i]+" repeated for: "+count+" times");
			}
		}

	}

}
