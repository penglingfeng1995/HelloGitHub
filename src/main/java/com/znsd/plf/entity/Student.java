package com.znsd.plf.entity;

public class Student {

	private int id;
	private String studentName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}
	public Student() {
		super();
	}
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}
	
	
	
}
