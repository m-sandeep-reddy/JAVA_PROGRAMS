package Dec03_Arrayss;

import java.util.Scanner;

public class Student_Driver {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of for the student for the Student array");
		int n = sc.nextInt();
		
		Student [] s = new Student[n];
		System.out.println("Enter "+n+" student details for student array\n");
		
		for(int i=0 ; i<n ; i++ )
		{
			System.out.println("Enter name of the Stdent");
			String name = sc.next();
			System.out.println("Enter age of the Stdent");
			int age = sc.nextInt();
			System.out.println("Enter id of the Stdent");
			int id = sc.nextInt();
			s[i] =new Student(name , age , id);
		}
		for(int i = 0 ; i<n ; i++)
		{
			System.out.println(s[i]);
		}
	}

}
