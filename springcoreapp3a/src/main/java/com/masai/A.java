package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service(value = "a1")
public class A {

//	public void funA() {
//		System.out.println("inside funA of A");
//	}
//}

	@Autowired
	@Qualifier("getB")
	private B b1;
	
	@Autowired
	private List<String> cities;
	
//	@PostConstruct
//	public void init() {
//		System.out.println("inside init method of A");
//	}
	
//	@Value("100")
//	int roll=100;
//	@Value("Ram")
//	String name;
//	@Value("780")
//	int marks;
	
//	@Value("${roll}")
//	int roll=100;
//	@Value("${name}")
//	String name;
//	@Value("${marks}")
//	int marks;
	
	@Autowired
	private Environment emv;
	
	public void funA() {
		System.out.println("inside funA of A");
        b1.funB();
        System.out.println(cities);
        
        System.out.println(emv.getProperty("name"));
        System.out.println(emv.getProperty("roll"));
        System.out.println(emv.getProperty("marks"));
	}
}
