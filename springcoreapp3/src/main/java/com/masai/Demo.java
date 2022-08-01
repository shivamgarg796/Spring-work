package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		// activate the spring container by locating the spring configuration file..
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//      A aObj = ctx.getBean("aid",A.class);//pulling the A obj
//		aObj.show();


		//		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		Collage collage = ctx.getBean("cl1",Collage.class);
//		List<Student> students= collage.getStudents();
//		System.out.println("Collage name is "+collage.getCollageName());
//		System.out.println("-----------------------------");
//		students.forEach(student -> {
//		student.displayDetails();
//		System.out.println("==================");
//		});

		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		A aObj = ctx.getBean("aid", A.class);
		aObj.show();

	}

}
