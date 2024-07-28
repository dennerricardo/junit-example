package junitexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTest {
	
	@Test
	void UserDennerValidation() {
		Assumptions.assumeFalse("root".equals(System.getenv("USER")));
		Assertions.assertEquals(10, 5+5);
	
	}

}
