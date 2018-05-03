package idv.ycy.designpattern.creational.builder.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import idv.ycy.designpattern.creational.builder.CarBuilder;
import idv.ycy.designpattern.creational.builder.component.CarBody;
import idv.ycy.designpattern.creational.builder.component.Engine;
import idv.ycy.designpattern.creational.builder.component.Interior;
import idv.ycy.designpattern.creational.builder.component.Tire;

public class SedanBuilder implements CarBuilder {
	private static Logger log = Logger.getLogger(SedanBuilder.class);

	public List<Tire> assembleTire() {
		// TODO Auto-generated method stub

		Tire tireFR = new SedanTire();
		Tire tireFL = new SedanTire();
		Tire tireRR = new SedanTire();
		Tire tireRL = new SedanTire();

		List<Tire> tires = new ArrayList<Tire>();
		tires.add(tireFR);
		log.info("Assemble [" + tireFR.getTireType() + "] FR");
		tires.add(tireFL);
		log.info("Assemble [" + tireFL.getTireType() + "] FL");
		tires.add(tireRR);
		log.info("Assemble [" + tireRR.getTireType() + "] RR");
		tires.add(tireRL);
		log.info("Assemble [" + tireRL.getTireType() + "] RL");

		return tires;
	}

	public Engine buildEngine() {

		Engine sedanEngine = new GasolineEngine();
		log.info("Build Engine [" + sedanEngine.getFuelType() + " Engine]");
		return sedanEngine;
	}

	public Interior buildInterior() {
		
		Interior sedanInterior = new Interior();
		log.info("Build Interior [" + sedanInterior.toString() + "]");
		return sedanInterior;
	}

	public CarBody buildCarBody() {
		
		CarBody sedanCarBody = new CarBody();
		log.info("Build CarBody [" + sedanCarBody.toString() + "]");
		return sedanCarBody;
	}

}
