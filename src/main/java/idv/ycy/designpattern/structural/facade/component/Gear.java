package idv.ycy.designpattern.structural.facade.component;

import org.apache.log4j.Logger;

public class Gear {
	private static Logger log = Logger.getLogger(Gear.class);
	
	public enum GearPosition{P, D, S, R}
	
	public void shiftGear(GearPosition origGear, GearPosition afterGear) {
		log.info("Shift gear from [" + origGear + "] to [" + afterGear + "]");
	}
	
}
