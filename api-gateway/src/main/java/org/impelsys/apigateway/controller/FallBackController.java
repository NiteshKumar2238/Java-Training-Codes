package org.impelsys.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	@GetMapping("/empServiceFallBack")
	public String empServiceFallBack() {
		return "Employee service is taking longer than expected. Please retry after some time";
		
	}
	@GetMapping("/deptServiceFallBack")
	public String deptServiceFallback() {
	
		return "Department service is taking longer than expected. Please retry after some time";
	}

}
