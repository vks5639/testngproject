package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jExample {
	
	public static Logger logger = LogManager.getLogger(log4jExample.class);

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		logger.trace("This is a trace message");
		logger.info("This is info message");
		logger.error("This is an error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");
		
	}

}
