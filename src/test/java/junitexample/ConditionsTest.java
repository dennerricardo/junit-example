package junitexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionsTest {
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void UserDennerValidation() {
		Assertions.assertEquals(10, 5+5);
	
	}

}
