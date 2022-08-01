package com.masai;

//dependent class
public class Travel {

	
//	Car car =new Car();
//	Bike b=new Bike();
	
	Vehicle v;
	
	String name;
	
	
//	//Setter injection point
//	public void setV(Vehicle v) {
//		this.v = v;
//	}
//	
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
	
	//Contructur injection point
//	public Travel(Vehicle v) {
//		super();
//		this.v = v;
//	}
	
//	Contructur injection point
	public Travel(Vehicle v, String name) {
		super();
		this.v = v;
		this.name = name;
	}
	
	public void journey() {
//		car.start2();
//		b.ride();
		v.go();
		
		System.out.println("Jounrney started...");
		System.out.println("Name is"+name);
		}







}
