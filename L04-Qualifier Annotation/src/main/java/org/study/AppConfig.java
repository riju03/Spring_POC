package org.study;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//This will specify spring that we are willing to create component based programming and we need to scan certain package.


@Configuration
@ComponentScan("org.study")  
public class AppConfig {

}
