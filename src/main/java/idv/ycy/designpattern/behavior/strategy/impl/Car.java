/**
 * 
 */
package idv.ycy.designpattern.behavior.strategy.impl;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.behavior.strategy.MoveStrategy;

public class Car{
	private static Logger log = Logger.getLogger(Car.class);
	
	public void move(MoveStrategy strategy) {
		// TODO Auto-generated method stub
		strategy.move();
	}

}
