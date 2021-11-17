package validators;

import javax.validation.ConstraintViolation;
import javax.validation.Payload;

public class Severity {
	public static class Info implements Payload
	{
		void OnInfo(ConstraintViolation violation){
			System.out.println("Violation of Severity level: INFO");
		}
		
	}

	public static class Error implements Payload
	{
		void OnError(ConstraintViolation violation){
		System.out.println("Violation of Severity level: ERROR");
		sendMail(violation);
		}
	}

	public static void sendMail(ConstraintViolation violation){
		System.out.println("Sending Email to HR "+ violation.getMessage());
	}
	
}
