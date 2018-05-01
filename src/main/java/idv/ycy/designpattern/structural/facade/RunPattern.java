package idv.ycy.designpattern.structural.facade;

import org.apache.log4j.Logger;



public class RunPattern {
	private static Logger log = Logger.getLogger(RunPattern.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("Starting [Facade] pattern demonstrate...");
		
		log.info("Car Starting...");
		Car c = new Car();
		c.start();
		log.info("Car Started");
		
		log.info("Demonstrate finished.");
		
	}

}
