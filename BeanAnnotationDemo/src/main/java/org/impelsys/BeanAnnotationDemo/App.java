package org.impelsys.BeanAnnotationDemo;

import org.impelsys.config.AppConfig;

import org.impelsys.impl.SamsungMobile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
         //SamsungMobile s8=context.getBean(SamsungMobile.class);
        //SamsungMobile s8=(SamsungMobile)context.getBean("samsungMobile");
//        System.out.println("Lazy loading the samsung mobile");
     SamsungMobile s8=(SamsungMobile)context.getBean("createSamsungPhone");
     s8.config();
    }
}
