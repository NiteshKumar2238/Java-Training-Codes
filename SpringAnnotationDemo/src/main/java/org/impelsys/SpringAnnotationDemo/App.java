package org.impelsys.SpringAnnotationDemo;

import org.impelsys.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Car myCar=(Car) applicationContext.getBean("mustang");
    	System.out.println("Car:"+myCar.getModel()+ "has engine of type:" +myCar.getMustangEngine().getEngineType());
        System.out.println( "Hello World!" );
    }
}
 