package org.impelsys.config;

import org.impelsys.impl.OctaCoreProcessor;
import org.impelsys.impl.QuadCoreProcessor;
import org.impelsys.impl.SamsungMobile;
import org.impelsys.model.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("org.impelsys.impl")
public class AppConfig {
	//factory methods/
	@Lazy
	@Bean
	public SamsungMobile createSamsungPhone(){
		return new SamsungMobile();
	}
	
	@Lazy
	@Bean
	public Processor quadraCoreProcessor(){
		return new QuadCoreProcessor();
	}
	
	@Lazy
	@Bean
	public Processor octaCoreProcessor(){
		return new OctaCoreProcessor();
	}
}
