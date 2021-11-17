package org.impelsys.impl;

import org.impelsys.model.Shift;

public class NightShift implements Shift{
	
	public NightShift(){
		System.out.println("Night shift default constructor");
	}
	
	public void shift(){
		System.out.println("Night Shift");
	}
}