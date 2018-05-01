package idv.ycy.designpattern.creational.factorymethod;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.factorymethod.impl.BusFactory;
import idv.ycy.designpattern.creational.factorymethod.impl.SedanFactory;

public class RunPattern {
	private static Logger log = Logger.getLogger(RunPattern.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("Starting [Factory Method] pattern demonstrate...");
		
		log.info("Initiate Bus factory implement");
		CarFactory factory = new BusFactory();
		Car bus = factory.produceCar();
		log.info("This is a [" + bus.getCarType() + "]");
		
		
		log.info("Initiate Sedan factory implement");
		factory = new SedanFactory();
		Car sedan = factory.produceCar();
		log.info("This is a [" + sedan.getCarType() + "]");
		
		log.info("Demonstrate finished.");
		
	}

}
