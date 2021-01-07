package collections;

public class Student {
	int id;
	String name;
	char gender;
	double marks;
	
	
	public Student(int id, String name, char gender, double marks) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}
	public String toString()
	{
		return "Id = "+this.id+" Name = "+this.name+" Gender = "+this.gender+" Marks = "+this.marks;
	}
	
	
	

}
