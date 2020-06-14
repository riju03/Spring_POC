package org.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.cars.Corrola;
import org.study.cars.Swift;
import org.study.interfaces.Car;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		/*
		 * here we are doing partial inversion of control where object of corrola class is created by spring
		 * but inside this object there is another object with name of engine and it is created manually.
		 * In this the error are not readable, so it is good to use spring way of handling things.
		 */
		
		Car myCar = context.getBean("myCorrola", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
