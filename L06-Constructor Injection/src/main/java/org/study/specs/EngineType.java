package org.study.specs;

import org.study.interfaces.Engine;

public class EngineType implements Engine {

	String type;

	public EngineType() {
		type = "unknown";
	}

	public EngineType(String type) {
		super();
		this.type = type;
	}

	@Override
	public String type() {
		return type;
	}

}
