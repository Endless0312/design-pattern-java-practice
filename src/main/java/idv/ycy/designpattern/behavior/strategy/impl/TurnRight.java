package idv.ycy.designpattern.behavior.strategy.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.behavior.strategy.MoveStrategy;

public class TurnRight implements MoveStrategy {
	private static Logger log = Logger.getLogger(TurnRight.class);
	
	public void move() {
		// TODO Auto-generated method stub
		log.info("Car is turning right.");
	}

}
