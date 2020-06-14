package org.study.cars;
import org.springframework.stereotype.Component;
import org.study.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	public String specs() {
		
		return "Hatchback from Suzuki";
	}

}
