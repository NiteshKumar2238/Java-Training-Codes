package validators;

import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import customannotations.Year;

public class YearConstraintValidator implements ConstraintValidator<Year,Date>{

	
	private int expectedYear;
	@Override
	public void initialize(Year year){
		expectedYear=year.value();
	}
	
	@Override
	public boolean isValid(Date dob, ConstraintValidatorContext arg1) {
		
		if(dob==null)
			return false;
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(dob);
		int year=cal.get(Calendar.YEAR);
		System.out.println("DOB year: "+year);
		return expectedYear==year;
	}

}
