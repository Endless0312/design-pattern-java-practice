package idv.ycy.designpattern.creational.prototype;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.abstractfactory.impl.BusFactory;
import idv.ycy.designpattern.creational.abstractfactory.impl.SedanFactory;

public class RunPattern {
	private static Logger log = Logger.getLogger(RunPattern.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			log.info("Starting [Abstract Factory] pattern demonstrate...");
			
			log.info("Initiate Bus factory implement");
			
			Tire tireA = new Tire();
			tireA.setTireType("BusTire");
			Car carA = new Car();
			
			carA.setCarType("Bus");
			log.info("Set Car A = [" + carA.getCarType() + "]");
			carA.setTire(tireA);
			log.info("Set Car A's tire= [" + carA.getTire() + "]");
			
			Car carB = (Car) carA.clone();
			
			log.info("Clone [Car A] to Car B");
			
			log.info("Get Car B = [" + carB.getCarType() + "]");
			log.info("Get Car B's tire= [" + carB.getTire() + "]");
			
			log.info("Demonstrate finished.");
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			log.error("",e);
		}
		
	}

}
