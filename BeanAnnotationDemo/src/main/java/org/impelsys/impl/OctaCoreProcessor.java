package org.impelsys.impl;

import org.impelsys.model.Processor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("octaCoreProcessor")
//@Primary
public class OctaCoreProcessor implements Processor {
	
	public OctaCoreProcessor(){
		System.out.println("Constructing Quadcore");
	}
	
	public void config(){
		System.out.println("This is a octa core processor");
	}
}
