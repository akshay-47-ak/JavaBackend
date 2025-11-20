package com.springCore.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	
	public static void main(String[] args) {
		
		
	      ApplicationContext context =  new ClassPathXmlApplicationContext("com/springCore/AutoWire/NewFile.xml");
	      
	      Emp em = context.getBean("emp",Emp.class);
	      
	      System.out.println(em);
		
		
	}
	
};
