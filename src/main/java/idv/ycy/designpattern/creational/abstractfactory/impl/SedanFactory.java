package idv.ycy.designpattern.creational.abstractfactory.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.abstractfactory.Car;
import idv.ycy.designpattern.creational.abstractfactory.CarFactory;
import idv.ycy.designpattern.creational.abstractfactory.Tire;

public class SedanFactory implements CarFactory {
	private static Logger log = Logger.getLogger(SedanFactory.class);
	
	public Car produceCar() {
		// TODO Auto-generated method stub
		Sedan sedan = new Sedan();
		log.info("SedanFactory produce a Sedan.");
		return sedan;
	}

	public Tire produceTire() {
		Tire tire = new SedanTire();
		tire.setTireType("SedanTire");
		log.info("SedanFactory produce a sedan tire.");
		return tire;
	}

	public Car assemble(Car car, Tire tire) {
		car.setTire(tire);
		return null;
	}
	
}
