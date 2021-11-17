package org.impelsys.springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employee;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println( "Hello World.....!" );
        
        Employee bean=(Employee) context.getBean("empBean");
        System.out.println("emp name"+bean.getName()+"has been allocated"+bean.getDevice().getModelNum());
    }
}
