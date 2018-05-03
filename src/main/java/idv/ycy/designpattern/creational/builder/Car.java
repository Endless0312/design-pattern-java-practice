package idv.ycy.designpattern.creational.builder;

import java.util.List;

import idv.ycy.designpattern.creational.builder.component.CarBody;
import idv.ycy.designpattern.creational.builder.component.Engine;
import idv.ycy.designpattern.creational.builder.component.Interior;
import idv.ycy.designpattern.creational.builder.component.Tire;

public abstract class Car {
	List<Tire> tires;
	CarBody carBody;
	Interior interior;
	Engine engine;

	public List<Tire> getTires() {
		return tires;
	}

	public void setTires(List<Tire> tires) {
		this.tires = tires;
	}

	public CarBody getCarBody() {
		return carBody;
	}

	public void setCarBody(CarBody carBody) {
		this.carBody = carBody;
	}

	public Interior getInterior() {
		return interior;
	}

	public void setInterior(Interior interior) {
		this.interior = interior;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
