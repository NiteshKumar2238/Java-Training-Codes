package org.impelsys.impl;

import org.impelsys.model.Shift;
import org.springframework.stereotype.Component;

@Component
public class DayShift implements Shift{
	
	public DayShift(){
		System.out.println(" Dayshift default constructor");
	}
	
	public void shift(){
		System.out.println("Day Shift");
		//System.out.println(empName +" "works in dayshift");
	}
}
