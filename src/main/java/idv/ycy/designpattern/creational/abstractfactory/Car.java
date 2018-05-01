package idv.ycy.designpattern.creational.abstractfactory;

public abstract class Car {

	String carType;
	Tire tire;

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

}
