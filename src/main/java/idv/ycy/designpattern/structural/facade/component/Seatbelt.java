package idv.ycy.designpattern.structural.facade.component;

import org.apache.log4j.Logger;

public class Seatbelt {
	private static Logger log = Logger.getLogger(Seatbelt.class);
	
	public void wear() {
		log.info("Wear the seatbelt.");
	}
	
	public void release() {
		log.info("Release the seatbelt.");
	}
}
