package Alfa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		log.debug("this debug");
		log.info("this info");
		log.warn("this is info");
		log.error("this is error");
		log.fatal("this is fatal");

	}

}
