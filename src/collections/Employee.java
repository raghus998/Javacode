package collections;

public class Employee {
	int id;
	String name;
	char gender;
	double salary;
	
	
	public Employee(int id, String name, char gender, double salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	public String toString()
	{
		return "ID = "+this.id+" Name = "+this.name+" Gender = "+this.gender+" Salary = "+this.salary;
	}
}
