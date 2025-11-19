package com.springCore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testLifeCycle {

	
	
	public static void main(String[] args) {
		
	AbstractApplicationContext	context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/lifeConfig.xml");
	
	context.registerShutdownHook();
	
	// Bean Life Cycle using XML
	Office of = (Office) context.getBean("o1");
	
	System.out.println(of);
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	
	//Bean Life Cycle using Interface
	Department d = (Department) context.getBean("d1");
	
	System.out.println(d);
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	
	// Bean Life Cycle using the Annotation
	Product p = (Product) context.getBean("p1");
	
	System.out.println(p);
	
		
	}
}
