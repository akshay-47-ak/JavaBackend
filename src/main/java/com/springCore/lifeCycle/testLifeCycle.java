package com.springCore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testLifeCycle {

	
	public static void main(String[] args) {
		
	AbstractApplicationContext	context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/lifeConfig.xml");
		  
	Office of = (Office) context.getBean("o1");
	
	System.out.println(of);
	
	context.registerShutdownHook();
		
	}
}
