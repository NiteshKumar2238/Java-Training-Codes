package controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Payload;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Employee;
import service.EmployeeService;
import validators.Severity;


@Controller
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/")
	public String home(Model model){
		System.out.println(" In Home");
		model.addAttribute("emp",new Employee());
		return "index";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(){
		System.out.println(" In Add Emp");
		return "addEmp";
	}
	
	@ModelAttribute
	public void commonStuff(Model model){
		model.addAttribute("HeaderStatus","Employee details");
		model.addAttribute("emp",new Employee());
	}
	
//	public String addEmployee(@RequestParam String ename,@RequestParam String salary,@RequestParam String desig )
//	{
	@RequestMapping("/add")
	public String addEmployee(@ModelAttribute("emp") @Valid Employee emp,BindingResult bindingResult )
	{
		System.out.println("In add employee controller!!!!!!!!!!!!!!");
//		System.out.println("In Create employee");
//		String empName=request.getParameter("ename");
//		String salary=request.getParameter("salary");
//		String designation=request.getParameter("desig");
//		String flag="success";
		
//		System.out.println(empName);
//		System.out.println(salary);
//		System.out.println(designation);
		
//		Employee emp=new Employee();
//		emp.setName(ename);
		//boolean flag=false;
		
		//System.out.println("Emplooyee:"+emp);
		//emp.setSalary(salary);
		//emp.setId(id);
		//bindingResult will store validation result errors
		if(bindingResult.hasErrors()){
			System.out.println("No. of error/s: "+bindingResult.getErrorCount());
			StringBuffer sb=new StringBuffer();
			for(Object object:bindingResult.getAllErrors()){
				if(object instanceof FieldError){
					FieldError fieldError=(FieldError) object;
					System.out.println(fieldError.getCode());
					sb.append(fieldError.getDefaultMessage());
					sb.append("\n");
					
				}
			}
			System.out.println("In Binding error :" +sb);
			/*System.out.println("Latest..............data");
			bindingResult.reject("errors",sb.toString());
			return "addEmp";*/
			
			boolean isSevereError=false;
			Validator validator=Validation.buildDefaultValidatorFactory().getValidator();
			Set<ConstraintViolation<Employee>> constraintViolations=validator.validate(emp);
			if(constraintViolations.size()>0){
				for(ConstraintViolation<Employee> violation: constraintViolations){
					Set<Class<?extends Payload>> payloads =violation.getConstraintDescriptor().getPayload();
					for(Class<? extends Payload> payload:payloads){
						if(payload == Severity.Error.class){
							isSevereError=true;
							Severity.sendMail(violation);
						}
					}
				}
				
				if(isSevereError){
					bindingResult.reject("dob","Mail sent to HR for year viloation in DOB field.Request");
				}
			}
			bindingResult.reject("errors",sb.toString());
			return "addEmp";
		}//end if
		
		
		
		boolean flag=employeeService.addEmployeeDetails(emp);
		System.out.println("******************");
		System.out.println(flag);
		System.out.println("******************");
		
		if(flag)
			return "success";
		else
			return "error";
					
}
	
	public ModelAndView addEmp(@ModelAttribute("emp") Employee emp)
	{
	 ModelAndView modelAndView =new ModelAndView("success");
	 return modelAndView;
		
	}
}