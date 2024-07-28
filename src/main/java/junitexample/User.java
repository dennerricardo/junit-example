package junitexample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Hello world!
 *
 */
public class User {
    
	private String name;
    private LocalDate birthdate;
	
    
    public User(String name, LocalDate birthdate) {
    	this.name = name;
		this.birthdate = birthdate;
	}
    
	public String getName() {
		return name;
	}
	
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	public int getAge() {
		return (int) ChronoUnit.YEARS.between(this.birthdate, LocalDate.now());
	} 
	
	public boolean isAnAdult() {
		return getAge() >= 21 ;
	}
    
    
    
}
