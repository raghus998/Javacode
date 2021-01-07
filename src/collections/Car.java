package collections;

public class Car {
	String name;
	String brand;
	double price;
	String color;
	
	
	public Car(String name, String brand, double price, String color) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public String toString()
	{
		return "Name = "+this.name+" Brand = "+this.brand+" Price="+this.price+" Color = "+this.color;
	}
	
	

}
