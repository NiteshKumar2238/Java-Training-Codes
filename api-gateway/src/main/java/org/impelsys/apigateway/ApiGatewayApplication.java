package org.impelsys.apigateway;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
//@EnableHystrix
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
		System.out.println("API-GATEWAY Main Class!!!");
	}
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		
		/*
		 * return builder.routes() .route("path_route",r->
		 * r.path("/employees/").and().method("POST","PUT","DELETE")
		 * .and().host("localhost*") .uri("http://localhost:9003"))
		 * .route("path_route",r ->r.path("employees/**").and().method("GET")
		 * .uri("http://localhost:9003")) .build();
		 */
		System.out.println("In customRouteLocator");
		
		return builder.routes()
				.route(r-> r.path("/employees/**")//.and().method("POST","PUT","DELETE")
				//.and().host("localhost*")
						.filters(f->f.circuitBreaker(c->c.setName("circuitbreaker").setFallbackUri("forward:/empServiceFallBack")))
				.uri("lb://EMPLOYEE-SERVICE"))
				.route(r ->r.path("/department/**")//.and().method("GET")
						.filters(f->f.circuitBreaker(c->c.setName("circuitbreaker").setFallbackUri("forward:/deptServiceFallBack")))
				.uri("lb://DEPARTMENT-SERVICE"))
				//.route(r ->r.path("employees/**")
				//.and().predicate(predicate->)
				//.uri("http://localhost:9002"))
				.build();
		
		
	}
	
	@Bean
	public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer(){
		
		System.out.println("In defaultCustomizer");
		
		CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.ofDefaults();
		TimeLimiterConfig timeLimiterConfig = TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(10)).build();
			
	return factory->factory.configureDefault(id->new Resilience4JConfigBuilder(id)
				.circuitBreakerConfig(circuitBreakerConfig).timeLimiterConfig(timeLimiterConfig).build());
	}

}