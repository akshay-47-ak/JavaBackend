package com.springCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Department implements InitializingBean ,DisposableBean{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
	  System.out.println("Bean Distroyed");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Initialised");
		
	}
	
	
	
}
