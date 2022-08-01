package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		MyBusinessClass m=ctx.getBean(MyBusinessClass.class, "mb");
//		m.fun1();
		
		Travel t=ctx.getBean("t",Travel.class);
		
		t.journey();

	}
	
}
