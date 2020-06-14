package org.study.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.study.interfaces.Car;

@Component("myCorrola")
public class Corrola implements Car {
	
	
	/*
	 *  Engine is the property for this class and we are autowiring the object of engine type.
	 *  whenever we make use of autowire we use default constructor
	 *  wheneverthere is no requirement to create an object in the memory spring may skip it
	 */
	
	
	// it will not create an object of Engine type if not required hence optimizing our app
	@Autowired(required = false)
	Engine engine;
	
	
	/*
	 *  now we want to update values: created setter for engine
	 *  We have to autowire the setter to get it working, without autowire spring ignores it
	 *  in below case spring will run this method before using it
	 */
	
	
	
	/*@Autowired
	public void setEngine(Engine engine) {
		engine.type ="new V8 Engine";
		this.engine = engine;
	}*/
	
	
	/*
	 * in case of constructor if we do not provide autowired it will still give new value, setter is a method which update
	 * the object later down the line, while constructor is used to create an object itself, so if we use autowire on 
	 * property or constructor it will make no difference.
	 */
	
	
	public Corrola(Engine engine) {
		engine.type ="new V8 Engine";
		this.engine = engine;
	}
	
	
	
	public String specs() {
		
		/*
		 * Whenever we make use of engine.type the reference engine will be injected with the object of Engine type.
		 */
		
		String specs = "Sedan from toyota with engine type as :"+engine.type;
		
		return specs;
	}


	


	

}
