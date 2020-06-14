package org.study.specs;

import org.springframework.stereotype.Component;
import org.study.interfaces.Engine;

@Component
public class V8 implements Engine {

	@Override
	public String type() {
		
		return "V8 Engine";
	}

}
