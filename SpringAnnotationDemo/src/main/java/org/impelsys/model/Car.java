package org.impelsys.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.Resource;

@Component
@PropertySource("classpath:car.properties")
public class Car {
	
	@Value("${type1}")
	private String type;
	
	@Value("${model1}")
	private String model;
	
	
	private Engine mustangEngine;
	

	//@Qualifier("mustangEngine")
	
	
	//@Autowired//constructor injection
	
	public Car(Engine e){
		System.out.println("In constructor");
		mustangEngine=e;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getModel() {
		return model;
	}
	
	@Required
	public void setModel(String model) {
		this.model = model;
	}

	public Engine getMustangEngine() {
		return mustangEngine;
	}

	@Resource
	public void setMustangEngine(Engine mustangEngine) {
		this.mustangEngine = mustangEngine;
	}
	
	

}
