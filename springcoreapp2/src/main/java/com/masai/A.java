package com.masai;

public class A {

//	B b1;
//
//	public A(B b1) {
//		super();
//		this.b1 = b1;
//	}
	
	
		private String message;
		
		public void setMessage(String message) {
		this.message = message;
		}


	
	public void setUp() {
		System.out.println("inside setup method");
		System.out.println("Message is :"+message);
		//we can define our initialization logic
		//example acquiring database connection
	}
	
	public void destroy() {
		System.out.println("inside destroy method of A class");
	}
	
	public void funA() {
		System.out.println("inside funa() OF A");
//		System.out.println(b1);
	}
}
