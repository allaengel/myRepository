package basic_learning;

import org.apache.log4j.Logger;

public class LogExample {
	
		private static final Logger log = Logger.getLogger(LogExample.class);
		
		public static void main(String args[]){
			log.debug("Hello from debug");
			log.info("Hello from info");
			log.warn("Hello from warn");
			log.error("Hello from error");
			
			
		}

}
