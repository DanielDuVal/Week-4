package bakery;

import java.util.Iterator;

public class BakeryMenuIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position = 0;
	
	public BakeryMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}	else {
			return true;
		}
	}

	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
	
	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException
				("You must have at least two items to remove an item.");
		}
		if(items[position-1] != null) {
			for(int i = position - 1; i < (items.length - 1); i++) {
				items[i] = items[i + 1];
			}
		}
	}
}
