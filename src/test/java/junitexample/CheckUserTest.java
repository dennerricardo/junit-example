package junitexample;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckUserTest {
	@BeforeAll
	static void settingConection() {
		DataBase.startConection();
		System.out.println("Running");
	}
	@BeforeEach
	void insertTestData() {
		DataBase.insertUser(new User("Marlus", LocalDate.of(2000, 1,10)));
	}
	
	@AfterEach
	void removeTestData() {
		DataBase.removetUser(new User("Marlus", LocalDate.of(2000, 1,10)));
	}
	
	@Test
	void validatingConection() {
		Assertions.assertTrue(true);
	}
	
	@Test
	void validatingConectionNull() {
		Assertions.assertNull(null);
	}
	
	@AfterAll
	static void closingConection() {
		DataBase.endConection();
		System.out.println("closing");
	}
}
