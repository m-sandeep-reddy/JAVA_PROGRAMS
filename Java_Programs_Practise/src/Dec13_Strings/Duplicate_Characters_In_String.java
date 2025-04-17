package Dec13_Strings;

public class Duplicate_Characters_In_String {
	public static void main(String[] args) {
		
		String s = "sandeep is a very good boy in the class";
		char ch [] = s.toCharArray();
		boolean b[] = new boolean[ch.length];
		
		for(int i =0 ; i<ch.length ;i++)
		{
			if(b[i]==false)
			{
				int count = 0;
				
				for(int j =0 ; j<ch.length ; j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						b[j]=true;
					}
					
				}
				if(count>1)
					System.out.println(ch[i]+"==>"+count);
			}
		}
	}

}
