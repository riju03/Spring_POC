package org.study.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.study.interfaces.Car;
import org.study.interfaces.Engine;


public class Corrola implements Car {


	@Autowired
	@Qualifier("engineType")
	Engine engine;

	public String specs() {

		String specs = "Sedan from toyota with engine type as :" + engine.type();

		return specs;
	}

}
