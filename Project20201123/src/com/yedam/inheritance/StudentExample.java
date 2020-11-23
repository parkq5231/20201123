package com.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "HONG";
		st1.school = "Yedam";
		st1.study();

		HighStudent hs1 = new HighStudent();
		hs1.name = "HWANG";
		hs1.school = "YDM";
		hs1.grade = "2";
		hs1.study();
		hs1.showGrade();

		st1 = new HighStudent();

	}// end of main
}// end of class