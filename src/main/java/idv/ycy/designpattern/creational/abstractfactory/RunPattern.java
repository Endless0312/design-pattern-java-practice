package idv.ycy.designpattern.creational.abstractfactory;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.abstractfactory.impl.BusFactory;
import idv.ycy.designpattern.creational.abstractfactory.impl.SedanFactory;

public class RunPattern {
	private static Logger log = Logger.getLogger(RunPattern.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("Starting [Abstract Factory] pattern demonstrate...");
		
		log.info("Initiate Bus factory implement");
		CarFactory factory = new BusFactory();
		Car bus = factory.produceCar();
		Tire bustire = factory.produceTire();
		
		factory.assemble(bus, bustire);
		
		log.info("Assemble [" + bus.getCarType() + "] & [" + bustire.getTireType() + "]");
		
		
		log.info("Initiate Sedan factory implement");
		factory = new SedanFactory();
		Car sedan = factory.produceCar();
		Tire sedanTire = factory.produceTire();
		
		factory.assemble(sedan, sedanTire);
		log.info("Assemble [" + bus.getCarType() + "] & [" + bustire.getTireType() + "]");
		
		log.info("Demonstrate finished.");
		
	}

}
