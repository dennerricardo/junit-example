package junitexample;

import java.time.LocalDate;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
	
	@Test
	void lauchValidation() {
		int[] firstLaunch = {10, 20, 30, 40, 50};
		int[] secondLaunch = {10, 20, 30, 40, 50};
		
		assertArrayEquals(firstLaunch, secondLaunch);
	}
	
	@Test
	void objectNullValidation() {
		User user = null ;
		
		assertNull(user);
		
		User user2 = new User("Denner", LocalDate.of(1994,5, 12));
		assertNotNull(user2);
	}
	
	@Test
	void typesValidation() {
		double price = 5.0 ;
		double price2 = 5.0;
		
		assertEquals(price, price2);
	}
}
