package Dec04_Arrayss;

public class Compare_Two_Arrays {

	public static void main(String[] args) {
		
		int [] a = {10,30,5};
		int [] b = {10,30,5};
		
		if(a.length == b.length)
		{
			int count = 0;
			for(int i = 0 ; i<a.length ; i++)
			{
				if(a[i] != b[i])
					count++;
				//if(a[i] == b[i])
				//	c++;
			}
			
			if(count == a.length)	// c=a.length
				System.out.println("Similar Arrays");
			else
				System.out.println("Not Similar Arrays");
		}
		else
			System.out.println("Not Similar Arrays");
		

	}

}
