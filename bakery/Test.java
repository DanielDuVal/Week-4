package bakery;

import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		BakeryMenu bakeryMenu = new BakeryMenu();
		assertNotNull(bakeryMenu);

		Iterator<MenuItem> iterator = bakeryMenu.createIterator();
		Waitress waitress = new Waitress();
		waitress.printMenu(iterator);	
	}
}
