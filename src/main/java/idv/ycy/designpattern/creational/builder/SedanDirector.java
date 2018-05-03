package idv.ycy.designpattern.creational.builder;

import idv.ycy.designpattern.creational.builder.impl.Sedan;
import idv.ycy.designpattern.creational.builder.impl.SedanBuilder;

public class SedanDirector {
	private SedanBuilder sedanBuilder;
	
	public SedanDirector(SedanBuilder sedanBuilder) {
		this.sedanBuilder = sedanBuilder;
	}
	
	public Car buildCar() {
		Car car = new Sedan();
		car.setCarBody(sedanBuilder.buildCarBody());
		car.setInterior(sedanBuilder.buildInterior());
		car.setEngine(sedanBuilder.buildEngine());
		car.setTires(sedanBuilder.assembleTire());
		return car;
	} 
	
	
}
