package org.study;
import org.study.cars.*;
import org.study.specs.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//This will specify spring that we are willing to create component based programming and we need to scan certain package.


@Configuration
@ComponentScan("org.study")  
public class AppConfig {
	
	// return type should be type of class and return object of the class
	// this will bring all the configuration in AppConfig class
	
	@Bean("myCorrola")
	public Corrola corrola() {
		return new Corrola();
	}
	@Bean("mySwift")
	public Swift swift() {
		return new Swift();
	}
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8 Engine");  // using parameterised constructor
	}
	

}
