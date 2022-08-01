package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		A a = ctx.getBean("a",A.class);//pulling the A obj
//		a.funA();
		
		PresentationBean pbean=ctx.getBean("pb", PresentationBean.class);//pulling the A obj
		
		pbean.present();

	}

//	private A a1;
//	private A a2;
//	private B b1;
//
//	public Demo() {
//		System.out.println("inside zero argument constructor..");
//	}
//
//	public Demo(B b1, A a1) {
//		this.b1 = b1;
//		this.a1 = a1;
//		System.out.println("inside 2 argument constructor..");
//	}
//
//	public Demo(B b1, A a1, A a2) {
//		this.b1 = b1;
//		this.a1 = a1;
//		this.a2 = a2;
//		System.out.println("inside 3 argument constructor..");
//	}
//
//	public void showDetails() {
//		System.out.println("inside showDetails....");
//		System.out.println("b1 is :" + b1);
//		System.out.println("a1 is :" + a1);
//		System.out.println("a2 is :" + a2);
//	}
	
//	public static void main(String[] args) {
		
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		A aobj = ctx.getBean("a1",A.class);//pulling the A obj
//		aobj.funA();
		
//		ClassPathXmlApplicationContext ctx1=(ClassPathXmlApplicationContext)ctx;
//		ctx1.close();
		
//		((ClassPathXmlApplicationContext)ctx).close();
		
//		public static void main(String[] args) {
//			
//			ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//			
//			A a = ctx.getBean("a1",A.class);//pulling the A obj
//			A a1 = ctx.getBean("a1",A.class);//pulling the A obj
//			System.out.println(a==a1);//to make singleton basis on id
//			
//
//	}

}
