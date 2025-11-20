package com.springCore.AutoWire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAnnotations {

	public static void main(String[] args) {
		
		
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/AutoWire/annotation/configAuto.xml");
	
           Emp1 em = context.getBean("emp1",Emp1.class);
           
          System.out.println(em);
    
		
	}
	
}
