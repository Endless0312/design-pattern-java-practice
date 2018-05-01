package idv.ycy.designpattern.creational.factorymethod.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.factorymethod.Car;

public class Bus implements Car {
	private static Logger log = Logger.getLogger(Bus.class);
	
	public String getCarType() {
		// TODO Auto-generated method stub
		log.info("This is a Bus.");
		return this.getClass().getName();
	}

}
