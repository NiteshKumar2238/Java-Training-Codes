package model;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	String engineType;

	public Engine(){
		System.out.println("Engine Constructor");
	}
	
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}
