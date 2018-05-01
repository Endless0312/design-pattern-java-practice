package idv.ycy.designpattern.creational.abstractfactory.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.abstractfactory.Car;
import idv.ycy.designpattern.creational.abstractfactory.CarFactory;
import idv.ycy.designpattern.creational.abstractfactory.Tire;

public class BusFactory implements CarFactory {
	private static Logger log = Logger.getLogger(BusFactory.class);
	
	public Car produceCar() {
		Bus bus = new Bus();
		bus.setCarType("Bus");
		log.info("BusFactory produce a bus.");
		return bus;
	}

	public Tire produceTire() {
		BusTire tire = new BusTire();
		tire.setTireType("BusTire");
		log.info("BusFactory produce a bus tire.");
		return tire;
	}

	public Car assemble(Car car, Tire tire) {
		car.setTire(tire);
		return null;
	}

}
