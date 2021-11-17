package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping("/add")
	public ModelAndView addEmployee(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("In Create employee");
		String empName=request.getParameter("ename");
		String empPhone=request.getParameter("ephone");
		String flag="success";
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("empName",empName);
		mv.addObject("empPhone",empPhone);
		
		if(flag.equalsIgnoreCase("success"))
			mv.setViewName("success.jsp");
		
		else
			mv.setViewName("error.jsp");
		
		return mv;
	}

	
}
