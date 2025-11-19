 package com.springCore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product {

	private String pName;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [pName=" + pName + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Start Method");
	
	}
	
	@PreDestroy
	public void end() {
		System.out.println("End Method");
	}
	
}
