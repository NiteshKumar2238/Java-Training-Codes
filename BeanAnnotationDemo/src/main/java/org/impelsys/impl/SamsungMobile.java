package org.impelsys.impl;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.impelsys.model.Mobile;
import org.impelsys.model.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("samsungGalaxy")
public class SamsungMobile implements Mobile{
	
	@Autowired
	@Qualifier("octaCoreProcessor")
	Processor processor;
	
	public SamsungMobile(){
		System.out.println("In constructor");
	}
	
	public void config(){
		System.out.println("quad core,8gb ram");
		processor.config();
	}

	
	
	
		//init method
	@PostConstruct
	public void init(){
		System.out.println("Initializing samsungMobile");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Destroying samsungMobile");
	}
	
}

