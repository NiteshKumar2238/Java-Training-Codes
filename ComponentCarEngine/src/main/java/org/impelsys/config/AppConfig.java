package org.impelsys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import model.Car;
import model.Engine;

@Configuration
@ComponentScan("model")
public class AppConfig {
	
	@Bean
	public Car showCar(){
		return new Car();
	}
	
	@Bean
	public Engine showEngine(){
		return new Engine();
	}
}
