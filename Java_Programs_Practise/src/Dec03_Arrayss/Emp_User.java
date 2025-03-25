package Dec03_Arrayss;

import java.util.ArrayList;

public class Emp_User {

	public static void main(String[] args) {
		 Employee []e = new Employee[5];
		
		e[0] = new Employee("Sandeep",101,50000);
		e[1] = new Employee("Sandy  ",102,56000);
		e[2] = new Employee("vineeth",103,30000);
		e[3] = new Employee("vikas  ",104,60000);
		e[4] = new Employee("bharath",105,35000);
		
		for(int i =0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}

	}

}
