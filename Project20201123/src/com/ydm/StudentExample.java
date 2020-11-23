package com.ydm;

public class StudentExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setCollege("김밥대학교");
		s1.setNo("15-1233");
		s1.setName("김밥만두");

		Student s2 = new Student("김밥대학교", "15-1234");
		s2.setName("참치김밥");
		
		Student s3 = new Student("김밥대학교", "15-1235", "김김", "경영학과");

		Student[] stds = { s1, s2, s3 };
		for (Student std : stds) {
			if ("김밥대학교".equals(std.getCollege())) {
				std.showStudentInfo();
			}
		}
		
	}// end of main
}// end of class
