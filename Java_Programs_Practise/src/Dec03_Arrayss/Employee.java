package Dec03_Arrayss;

public class Employee {

	String name;
	int id;
	double sal;
	
	Employee()
	{}
	
	Employee(String name , int id , double sal)
	{
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	
	public String toString()	
	{
		return "Employee [ name = "+ name + ", id = "+id+", sal = "+sal +" ]";
	}
	

}