package com.yedam.db;

import java.util.Scanner;

public class EmpMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// 사원정보,부서정보
		while (true) {
			System.out.println("========================");
			System.out.println("1.사원정보 2.부서정보 3.종료 4.사원입력.");
			System.out.println("========================");
			System.out.println("선택> ");
			int selectNo = scn.nextInt(); scn.nextLine();
			if (selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] employees = dao.getEmpList();
				for (Employee emp : employees) {
					if (emp != null) {
						emp.showEmpInfo();
					}
				}

			} else if (selectNo == 2) {
				deptDAO dao = new deptDAO();
				department[] departments = dao.getdepartsList();
				for (department depart : departments) {
					if (depart != null) {
						depart.showDeptInfo();
					}
				}
			} else if (selectNo == 3) {
				break;
			} else if (selectNo == 4) {
				addEmployee();
			}

		}
		System.out.println("end of prog");

	}// end of main

	public static void addEmployee() {
		System.out.println("이름입력하세요.");
		String name = scn.nextLine();
		System.out.println("이메일을 입력하세요.");
		String email = scn.nextLine();
		System.out.println("입사일자를 입력하세요.");
		String hireDate = scn.nextLine();
		System.out.println("직무를 입력하세요.");
		String jobId = scn.nextLine();

		Employee emp = new Employee(name, email, hireDate, jobId);

		EmpDAO dao=new EmpDAO();
		dao.insertEmployee(emp);
		

		
	}
}// end of class