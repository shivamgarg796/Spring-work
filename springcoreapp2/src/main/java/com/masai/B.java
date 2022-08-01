package com.masai;

public class B {

//	A a1;

//Constructor injection 
//	public B(A a1) {
//		super();
//		this.a1 = a1;
//	}

	// setter injection
//	public void setA1(A a1) {
//		this.a1 = a1;
//	}

	private int number;

	public void setNumber(int number) {
		this.number = number;
	}

	public B() {
		System.out.println("inside the constructor of B");
	}

	public void init() {
		System.out.println("inside init of B");
		System.out.println(number);
	}

	public void funB() {
		System.out.println("inside funB() OF B");
	}

}
