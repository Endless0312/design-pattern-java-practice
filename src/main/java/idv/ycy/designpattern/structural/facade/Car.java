package idv.ycy.designpattern.structural.facade;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.structural.facade.component.*;
import idv.ycy.designpattern.structural.facade.component.Gear.GearPosition;

public class Car {
	private static Logger log = Logger.getLogger(Car.class);
	
	private Gear gear = new Gear();
	private Seatbelt seatbelt = new Seatbelt();
	private Brake brake = new Brake();
	private Engine engine = new Engine();
	
	public void start() {
		
		seatbelt.wear();
		brake.hold();
		engine.start();
		gear.shiftGear(GearPosition.P, GearPosition.D);
		brake.release();
		
	}
	
}
