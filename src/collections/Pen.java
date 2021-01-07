package collections;

public class Pen {
	int price;
	String color;
	String company;
	char type;
	
	
	public Pen(int price, String color, String company, char type) {
		this.price = price;
		this.color = color;
		this.company = company;
		this.type = type;
	}
	public String toString()
	{
		return "Price = "+this.price+" Color = "+this.color+" Company = "+this.company+" Type ="+this.type;
	}
}
