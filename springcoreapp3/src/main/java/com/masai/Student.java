package com.masai;

import java.util.Objects;

public class Student {

	
	private int roll;
	private String name;
	private int marks;
	
	
	//constructor injection point
	public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	}
	
	public void displayDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(marks, name, roll);
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
//	}

	@Override
	public boolean equals(Object obj) {
	Student s1= this;
	Student s2=(Student)obj;
	if(s1.roll == s2.roll && s1.name.equals(s2.name) && s1.marks == s2.marks)
	return true;
	else
	return false;
	}
	
	@Override
	public int hashCode() {
	return this.roll;
	}
	
	
	

}
