package com.springCore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testLifeCycle {

	
	
	public static void main(String[] args) {
		
	AbstractApplicationContext	context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/lifeConfig.xml");
	
	context.registerShutdownHook();
	
	Office of = (Office) context.getBean("o1");
	
	System.out.println(of);
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	
	Department d = (Department) context.getBean("d1");
	
	System.out.println(d);
	
	
		
	}
}
