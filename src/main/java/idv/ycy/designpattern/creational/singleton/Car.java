package idv.ycy.designpattern.creational.singleton;

import org.apache.log4j.Logger;

public class Car {
	private static Logger log = Logger.getLogger(Car.class);
	
	private static Car carInstance;
	
	private Car() {};
	
	public static Car getInstance() {
		if (carInstance == null) {
			
			carInstance = new Car();
			log.info("Car initialize [" + carInstance + "]");
			log.info("Return new car [" + carInstance + "]");
			
		}else {
			
			log.info("Return existing car [" + carInstance + "]");
		}
		
		return carInstance;
	}
	
}
