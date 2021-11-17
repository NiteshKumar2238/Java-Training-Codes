package org.impelsys.ComponentCarEngine;

import org.impelsys.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new  AnnotationConfigApplicationContext(AppConfig.class);
    	Car ford=(Car) context.getBean("car");
    	ford.getEngine();
    	
        System.out.println( "Hello World!" );
    }
}
