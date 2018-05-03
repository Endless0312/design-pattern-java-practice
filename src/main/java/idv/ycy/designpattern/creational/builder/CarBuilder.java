package idv.ycy.designpattern.creational.builder;

import java.util.List;

import idv.ycy.designpattern.creational.builder.component.CarBody;
import idv.ycy.designpattern.creational.builder.component.Engine;
import idv.ycy.designpattern.creational.builder.component.Interior;
import idv.ycy.designpattern.creational.builder.component.Tire;

public interface CarBuilder {
	public List<Tire> assembleTire();

	public Engine buildEngine();

	public Interior buildInterior();

	public CarBody buildCarBody();
}
