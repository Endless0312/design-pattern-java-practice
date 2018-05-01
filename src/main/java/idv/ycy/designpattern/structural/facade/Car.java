package idv.ycy.designpattern.structural.facade;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.structural.facade.component.*;
import idv.ycy.designpattern.structural.facade.component.Gear.GearPosition;

public class Car {
	private static Logger log = Logger.getLogger(Car.class);
	
	public void start() {

		Gear gear = new Gear();
		Seatbelt seatbelt = new Seatbelt();
		Brake brake = new Brake();
		Engine engine = new Engine();
		
		seatbelt.wear();
		brake.hold();
		engine.start();
		gear.shiftGear(GearPosition.P, GearPosition.D);
		brake.release();
		
	}
	
}
