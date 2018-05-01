package idv.ycy.designpattern.creational.factorymethod.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.factorymethod.Car;

public class Sedan implements Car {
	private static Logger log = Logger.getLogger(Sedan.class);
	
	public String getCarType() {
		// TODO Auto-generated method stub
		log.info("This is a Sedan.");
		return this.getClass().getName();
	}
}
