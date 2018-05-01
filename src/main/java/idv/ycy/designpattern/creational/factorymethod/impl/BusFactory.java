package idv.ycy.designpattern.creational.factorymethod.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.factorymethod.Car;
import idv.ycy.designpattern.creational.factorymethod.CarFactory;

public class BusFactory implements CarFactory {
	private static Logger log = Logger.getLogger(BusFactory.class);
	
	public Car produceCar() {
		Bus bus = new Bus();
		log.info("BusFactory produce a bus.");
		return bus;
	}

}
