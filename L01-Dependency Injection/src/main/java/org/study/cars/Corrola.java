package org.study.cars;

import org.springframework.stereotype.Component;
import org.study.interfaces.Car;

@Component("corrola")
public class Corrola implements Car {

	public String specs() {
		
		return "Sedan from Toyota";
	}

}
