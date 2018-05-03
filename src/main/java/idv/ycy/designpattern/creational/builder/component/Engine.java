package idv.ycy.designpattern.creational.builder.component;

import org.apache.log4j.Logger;

public abstract class Engine {
	private static Logger log = Logger.getLogger(Engine.class);

	private String fuelType;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fuelType + " Engine";
	}
	
}
