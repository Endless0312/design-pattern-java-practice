package idv.ycy.practice.designpattern;

import idv.ycy.designpattern.creational.prototype.Car;
import idv.ycy.designpattern.creational.prototype.Tire;
import junit.framework.TestCase;

public class PrototypeTest extends TestCase {

	protected Car carA;
	protected Car carB;
	protected Tire tireA;

	protected void setUp() throws Exception {
		
		tireA = new Tire();
		tireA.setTireType("BusTire");
		
		carA = new Car();
		carA.setTire(tireA);
		
		carB = (Car) carA.clone();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCarType() throws CloneNotSupportedException {

		String carAType = carA.getCarType();
		String carBType = carB.getCarType();
		
		assertEquals(carAType, carBType);
		
		
	}
	
	public void testCarTire() throws CloneNotSupportedException {

		String carATire = carA.getTire().getTireType();
		
		String carBTire = carB.getTire().getTireType();
		
		assertEquals(carATire, carBTire);
		
		
	}
}
