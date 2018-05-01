package idv.ycy.designpattern.structural.facade.component;

import org.apache.log4j.Logger;

public class Brake {
	private static Logger log = Logger.getLogger(Brake.class);
	
	public void hold() {
		log.info("Hold the brake.");
	}
	
	public void release() {
		log.info("Release the brake.");
	}
	
}
