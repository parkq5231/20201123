package com.ydm;

public class Student {
	// field
	private String college;
	private String no;
	private String name;
	private String className;

	// constructor
	public Student() {
	}
	public Student(String college, String no) {
		this.college = college;
		this.no = no;
	}
	public Student(String college, String no, String name, String className) {
		this.college = college;
		this.no = no;
		this.name = name;
		this.className = className;
	}
	// method
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	//method2
	public void showStudentInfo() {
		System.out.println("학교명: "+college+" 학번: "+no+" 이름: "+name);
	}

}// end of class
