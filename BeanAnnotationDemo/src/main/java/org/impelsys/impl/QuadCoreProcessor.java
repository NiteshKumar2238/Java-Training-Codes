package org.impelsys.impl;

import org.impelsys.model.Processor;
import org.springframework.stereotype.Component;

@Component
public class QuadCoreProcessor implements Processor{
	
	
	public QuadCoreProcessor(){
		System.out.println("Constructing Quadcore");
	}
	public void config(){
		System.out.println("This is a quad core processor");
	}
}
