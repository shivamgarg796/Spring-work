package com.masai;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class A {

	// collection type dependency
//	private List<String> names;

	// setter injection point
//	public void setNames(List<String> names) {
//	this.names = names;
//	}
//	
//	public void show() {
//		System.out.println("inside showA of A ");
//		System.out.println(names);
//		}

	// normal array type dependency
//	private String[] names;
//
//	public void setNames(String[] names) {
//		this.names = names;
//	}
//
//	public void show() {
//		System.out.println("inside showA of A ");
//		System.out.println(Arrays.toString(names));
//	}

//	private Set<String> theSet;
//	public void setTheSet(Set<String> theSet) {
//	this.theSet = theSet;
//	}
//	public void show() {
//	System.out.println("inside showA of A ");
//	System.out.println(theSet);
//	}

//	private Map<Student, String> theMap;
//	public void setTheMap(Map<Student, String> theMap) {
//		this.theMap = theMap;
//	}
//
//	public void show() {
//		System.out.println("inside showA of A ");
//		System.out.println(theMap);
//		
//		theMap.forEach((student, string) -> {
//			System.out.println("The College Name is"+string);
//		   student.displayDetails();
//		   System.out.println("============================");
//		});
//	}

	private Properties theProperties;
	public void setTheProperties(Properties theProperties) {
		this.theProperties = theProperties;
	}

	public void show() {
		System.out.println("inside showA of A ");
		System.out.println(theProperties);
	}

}
