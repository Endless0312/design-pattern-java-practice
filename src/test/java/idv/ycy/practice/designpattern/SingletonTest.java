package idv.ycy.practice.designpattern;

import idv.ycy.designpattern.creational.singleton.Car;
import junit.framework.TestCase;

public class SingletonTest extends TestCase {

	Car car = Car.getInstance();
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPattern() {
		
		Car firstCar = car.getInstance();
		Car secondCar = car.getInstance();
		
		int firstCarHash = System.identityHashCode(firstCar);
		int secondCarHash = System.identityHashCode(secondCar);
		
		assertEquals(firstCarHash, secondCarHash);
		
	}
}
