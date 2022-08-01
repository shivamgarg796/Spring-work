package com.masai;

import java.util.List;

public class Collage {

	private String collageName;
	private List<Student> students;

	// constructor injection point for collageName
	public Collage(String collageName) {
		this.collageName = collageName;
	}

	public String getCollageName() {
		return collageName;
	}

	// setter injection point for List
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

}
