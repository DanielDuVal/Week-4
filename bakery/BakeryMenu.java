package bakery;

import java.util.ArrayList;
import java.util.Iterator;

public class BakeryMenu implements Menu{
	static final int MAXSIZE = 4;
	int currentSize = 0;
	MenuItem[] menuItems;

	public BakeryMenu() {
		menuItems = new MenuItem[MAXSIZE];
		
		add("Chocolate Chip Cookie",
			"fresh baked chocolate chip cookie, oozing with warm melty chocolate",
			true, 1.99);
		add("Angel Food Cake",
			"Light, fluffy, drizzled in strawberries, heavenly...",
			false,
			14.99);
		add("Carrot Cake", "All natural carrot cake recipe full of luscious,"
			+ " juicy, organic carrots and topped with rich cream cheese icing",
			true, 15.99);
		add("Cheesecake", "Delicate flavors of fresh cream, sugar, and a hint of "
				+ "lemon balance the velvety richness for a simply sophisticated "
				+ "experience our classic recipe",
				false, 19.99);
	}
	
	public void add(String name, String description, boolean vegan, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegan, price);
		if(currentSize >= MAXSIZE) {
			System.err.println("Menu is full!");
		} else {
			menuItems[currentSize] = menuItem;
			currentSize = currentSize + 1;
		}
	}

	public Iterator<MenuItem> createIterator() {
		return new BakeryMenuIterator(menuItems);
	}
}
