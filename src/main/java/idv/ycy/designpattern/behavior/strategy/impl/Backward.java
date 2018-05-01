package idv.ycy.designpattern.behavior.strategy.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.behavior.strategy.MoveStrategy;

public class Backward implements MoveStrategy {
	private static Logger log = Logger.getLogger(Backward.class);
	
	public void move() {
		// TODO Auto-generated method stub
		log.info("Car is moving backward.");
	}

}
