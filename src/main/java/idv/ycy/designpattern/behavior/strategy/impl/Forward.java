package idv.ycy.designpattern.behavior.strategy.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.behavior.strategy.MoveStrategy;

public class Forward implements MoveStrategy {
	private static Logger log = Logger.getLogger(Forward.class);
	
	public void move() {
		// TODO Auto-generated method stub
		log.info("Car is moving forward.");
	}

}
