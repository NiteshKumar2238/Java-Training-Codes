package org.impelsys.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;


//import org.springframework.cloud.netflix.eureka.loadbalancer.*;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeServiceApplication {
	
		@Bean
		@LoadBalanced
		public RestTemplate restTemplate() {
			return new RestTemplate();
		}
		
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
		System.out.println("In Main EmpService V2 !!!!!");
	}

}
