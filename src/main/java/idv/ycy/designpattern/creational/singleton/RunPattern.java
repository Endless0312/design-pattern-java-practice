package idv.ycy.designpattern.creational.singleton;

import org.apache.log4j.Logger;

public class RunPattern {
	private static Logger log = Logger.getLogger(RunPattern.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("Starting [Singleton] pattern demonstrate...");
		
		Car car1 = Car.getInstance();
		
		log.info("Get car 1 = [" + car1 + "]");
		
		Car car2 = Car.getInstance();
		
		log.info("Get car 2 = [" + car2 + "]");
		
		Car car3 = Car.getInstance();
		
		log.info("Get car 3 = [" + car3 + "]");
		
		log.info("Demonstrate finished.");
	}

}
