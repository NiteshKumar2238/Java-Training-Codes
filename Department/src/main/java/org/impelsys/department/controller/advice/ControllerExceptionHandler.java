package org.impelsys.department.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class ControllerExceptionHandler {
	
	@ResponseStatus
	@ExceptionHandler
	public String handler(Exception e) {
		return e.getMessage();
	}
}
