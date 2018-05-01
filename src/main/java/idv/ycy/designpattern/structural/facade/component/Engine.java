package idv.ycy.designpattern.structural.facade.component;

import org.apache.log4j.Logger;

public class Engine {
	private static Logger log = Logger.getLogger(Engine.class);
	
	public void start() {
		log.info("Start the engine.");
	}
	
	public void stop() {
		log.info("Stop the engine.");
	}
	
}
