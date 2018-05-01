package idv.ycy.designpattern.creational.abstractfactory;

public interface CarFactory {
	
	public Car produceCar();
	
	public Tire produceTire();
	
	public Car assemble(Car car, Tire tire);
}
