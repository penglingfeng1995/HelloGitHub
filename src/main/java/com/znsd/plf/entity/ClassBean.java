package com.znsd.plf.entity;

public class ClassBean {

	private int id;
	private String className;
	@Override
	public String toString() {
		return "Class [id=" + id + ", className=" + className + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public ClassBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
