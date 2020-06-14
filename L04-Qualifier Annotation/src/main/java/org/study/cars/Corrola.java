package org.study.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.study.interfaces.Car;
import org.study.interfaces.Engine;

@Component("myCorrola")
public class Corrola implements Car {

	/*
	 * We have tow components V6 and V8 and both are of type Engine. this reference
	 * can accommodate V6 or V8 engine so there is ambiguity Here we can explicitly
	 * give the name of the component we wish to autowire
	 * v8 or v6 is the default name in lower case
	 * 
	 */

	@Autowired
	@Qualifier("V6Engine")
	Engine engine;

	public String specs() {

		String specs = "Sedan from toyota with engine type as :" + engine.type();

		return specs;
	}

}
