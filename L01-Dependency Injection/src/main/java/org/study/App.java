package org.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.study.cars.Corrola;
import org.study.cars.Swift;
import org.study.interfaces.Car;

public class App {

	public static void main(String[] args) {

		Car swift = new Swift();
		Car corrola = new Corrola();

		System.out.println(swift.specs());
		System.out.println(corrola.specs());

		/*
		 * whenever we need to call a method we need to create object of that class.
		 * myCar reference variable can take any type of object i.e. swift or Corrola
		 * but we need to call the constructor of that particular class to see changes
		 * in o/p. This in no component based we can not change objects at run time.
		 * 
		 * In dependency injection we can inject different type of object based on our
		 * requirement for this we have annotation.
		 * 
		 */

	//	Car myCar = new Swift();
	//	System.out.println(myCar.specs());
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		/* here we have specified that we get  bean of car type, bean is object of car type, but car is interface
		which can be implemented by multiple classes  so we can have car object of swift and corolla in here
		so this will not be executed.
	    to mark class as bean use component annotation,swift class is marked as bean class here 
	    
	    Component based programming is where we can replace something with something else easily,
	    we can develop one application and distribute to other places
	    
	    if we are using custom name in component then need to specify name here
	    */
		
		Car myCar = context.getBean("swift",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
