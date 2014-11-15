package basic_learning;

// org.apache.log4j is package name
// Logger is the class name
import org.apache.log4j.Logger;

public class LogExample {

	private static final Logger log = Logger.getLogger(LogExample.class);
	
	public static void main(String args[]){
		log.debug("Hello world from debug");
		log.info("Hello world from info");
		log.warn("Hello world from warn");
		log.error("Hello world from error");
	}
}
