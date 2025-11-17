package com.springCore.constructor;

public class Addition {
	
	private int a;
	private int b;
	
	Addition( int a , int b){
		 this.a= a;
		 this.b=b;
	}
   
	Addition(double a, double b){
		this.a = (int) a;
		this.b=  (int) b;
		
		System.out.println("Double Constructor Called");
	}
	
	
	public void add() {
		System.out.println("sum of a and b  :"+(this.a+this.b));
	}
}
