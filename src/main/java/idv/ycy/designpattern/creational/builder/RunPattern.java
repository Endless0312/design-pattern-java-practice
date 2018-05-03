package idv.ycy.designpattern.creational.builder;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.builder.impl.SedanBuilder;

public class RunPattern {
	private static Logger log = Logger.getLogger(RunPattern.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("Starting [Builder] pattern demonstrate...");
		
		log.info("Sedan Build Starting...");
		
		SedanDirector director = new SedanDirector(new SedanBuilder());
		Car car = director.buildCar();
		
		log.info("The carbody of this car is [" + car.getCarBody().toString() + "]");
		log.info("The engine of this car is [" + car.getEngine().toString() + "]");
		log.info("The interior of this car is [" + car.getInterior().toString() + "]");
		log.info("The tire 0 of this car is [" + car.getTires().get(0).getTireType() + "]");
		log.info("The tire 1 of this car is [" + car.getTires().get(1).getTireType() + "]");
		log.info("The tire 2 of this car is [" + car.getTires().get(2).getTireType() + "]");
		log.info("The tire 3 of this car is [" + car.getTires().get(3).getTireType() + "]");
		
		log.info("Sedan Build Finished");
		
		log.info("Demonstrate finished.");
		
	}

}
