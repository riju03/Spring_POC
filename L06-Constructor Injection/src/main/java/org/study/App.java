package org.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.study.interfaces.Car;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		/*
		 * bean is the java object created by spring
		 */
		
		Car myCar = context.getBean("myCorrola", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
