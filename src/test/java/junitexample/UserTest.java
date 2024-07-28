package junitexample;


import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
	
   @Test 
   void userAgeValidation() {
	   User user = new User("Denner", LocalDate.of(1994,5, 12));
	   Assertions.assertEquals(30, user.getAge());
   }
   
   @Test
   void isAdultValidation() {
	   User user = new User("Denner", LocalDate.of(1994,5, 12));
	   Assertions.assertTrue(user.isAnAdult());
	   
	   User user2 = new User("Ricardo", LocalDate.of(2005,6, 4));
	   Assertions.assertFalse(user2.isAnAdult());
   }
}
