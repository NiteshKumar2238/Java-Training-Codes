package org.impelsys.config;

import org.impelsys.impl.DayShift;
import org.impelsys.impl.Employee;
import org.impelsys.impl.NightShift;
import org.impelsys.model.Shift;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.impelsys.impl")
public class AppConfig {
	
	@Bean
	public Employee employeeBean(){
		return new Employee();
	}
	
	@Bean
	public Shift dayShiftBean(){
		return new DayShift();
	}
	
	@Bean
	public Shift nightShift(){
		return new NightShift();
	}
}
