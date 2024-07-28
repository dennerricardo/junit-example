package junitexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrder {
	@Order(2)
	@Test
	void validatingA() {
		Assertions.assertTrue(true);
	}
	@Order(1)
	@Test
	void validatingB() {
		Assertions.assertTrue(true);
	}
	@Order(3)
	@Test
	void validatingC() {
		Assertions.assertTrue(true);
	}
	@Order(4)
	@Test
	void validatingD() {
		Assertions.assertTrue(true);
	}

}
