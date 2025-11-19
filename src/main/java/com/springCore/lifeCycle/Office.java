package com.springCore.lifeCycle;

public class Office {
	
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Office [dept=" + dept + "]";
	}
	
	public void init() {
		System.out.println("Init Invoked");
	}
	
	public void destroy() {
		System.out.println("Destroy Invoked");
	}
 
}
