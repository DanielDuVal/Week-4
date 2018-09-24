package bakery;

public class MenuItem {
	String name;
	String description;
	boolean vegan;
	double price;
	
	public MenuItem(String name, String description, boolean vegan, double price) {
		this.name = name;
		this.description = description;
		this.vegan = vegan;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isVegan() {
		return vegan;
	}
}
