package bakery;

import java.util.*;

public class Waitress {
	
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ": " + menuItem.getPrice());
			System.out.println(" " + menuItem.getDescription());
		}
	}
	

}
