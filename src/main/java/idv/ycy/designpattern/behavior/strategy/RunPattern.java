package idv.ycy.designpattern.behavior.strategy;

import org.apache.log4j.Logger;
import idv.ycy.designpattern.behavior.strategy.impl.Car;
import idv.ycy.designpattern.behavior.strategy.impl.*;


public class RunPattern {
	private static Logger log = Logger.getLogger(RunPattern.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("Starting [Strategy] pattern demonstrate...");
		
		Car c = new Car();
		c.move(new Forward());
		c.move(new Backward());
		c.move(new TurnLeft());
		c.move(new TurnRight());
		
		log.info("Demonstrate finished.");
		
	}

}
