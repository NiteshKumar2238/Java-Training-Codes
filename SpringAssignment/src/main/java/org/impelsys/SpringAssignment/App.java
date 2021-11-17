package org.impelsys.SpringAssignment;

import org.impelsys.config.AppConfig;
import org.impelsys.impl.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Employee emp=(Employee) context.getBean("employeeBean");
        System.out.println( "Hello World!" );
    }
}
