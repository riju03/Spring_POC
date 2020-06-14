package org.study.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.study.interfaces.Car;

@Component("myCorrola")
public class Corrola implements Car {
	
	
	/*
	 *  here we are manually creating an object which is not desired.
	 *  we will call spring to inject engine object directly.
	 *  In order to allow spring to create an object whenever there is a requirement for this reference
	 *  Advantage of autowired is that it make debugging and error handling easier we get proper logs.
	 */
	
	@Autowired
	Engine engine;
	
	
	public String specs() {
		
		/*
		 * Whenever we make use of engine.type the reference engine will be injected with the object of Engine type.
		 */
		
		String specs = "Sedan from toyota with engine type as :"+engine.type;
		
		return specs;
	}

}
