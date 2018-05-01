package idv.ycy.designpattern.creational.factorymethod.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.factorymethod.Car;
import idv.ycy.designpattern.creational.factorymethod.CarFactory;

public class SedanFactory implements CarFactory {
	private static Logger log = Logger.getLogger(SedanFactory.class);
	
	public Car produceCar() {
		// TODO Auto-generated method stub
		Sedan sedan = new Sedan();
		log.info("SedanFactory produce a Sedan.");
		return sedan;
	}

}
