package junitexample;

import java.util.logging.Logger;

public class DataBase {
	
	private static final Logger LOGGER = Logger.getLogger(DataBase.class.getName());
	
	public static void startConection() {
		LOGGER.info("Starting conection");
	}

	public static void endConection() {
		LOGGER.info("ending conection");
	}
	
	public static void insertUser(User user) {
		LOGGER.info("User created");
	}
	public static void removetUser(User user) {
		LOGGER.info("User removed");
	}
}
