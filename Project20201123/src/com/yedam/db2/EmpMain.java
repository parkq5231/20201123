package com.yedam.db2;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		// 1.전체조회,2.한건조회,3.입력,4.수정,5.삭제
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();

		while (true) {
			System.out.println("------------------------------");
			System.out.println("1.전체조회 2.한건조회 3.입력 4.수정 5.삭제 6.종료 7.부서별조회");
			System.out.println("------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				List list = service.getEmpList();
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpInfo();
				}

			} else if (selectNo == 2) {
				System.out.println("조회할 사원번호: ");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);

				vo.showEmpInfo();

			} else if (selectNo == 3) {
				System.out.println("사원번호: ");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("성: ");
				String firstName = scn.nextLine();
				System.out.println("이름: ");
				String lastName = scn.nextLine();
				System.out.println("이메일: ");
				String email = scn.nextLine();
				System.out.println("고용: ");
				String hireDate = scn.nextLine();
				System.out.println("직종: ");
				String jobId = scn.nextLine();

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setFirstName(firstName);
				vo.setLastName(lastName);
				vo.setEmail(email);
				vo.setHireDate(hireDate);
				vo.setJobId(jobId);

				service.insertEmp(vo);

			} else if (selectNo == 4) {

				System.out.println("수정할 사원번호: ");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 이메일: ");
				String email = scn.nextLine();
				System.out.println("수정할 전화번호: ");
				String phoneNum = scn.nextLine();
				System.out.println("수정할 급여: ");
				String salary = scn.nextLine();

				if (salary == null || salary.equals(""))
					salary = "0";
				int sal = Integer.parseInt(salary);

				EmployeeVO vo = new EmployeeVO();

				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNum);
				vo.setSalary(sal);

				service.updateEmp(vo);

			} else if (selectNo == 5) {
				System.out.println("삭제할 사원번호: ");
				int empId = scn.nextInt();

				service.deleteEmp(empId);

			} else if (selectNo == 6) {
				break;
			} else if (selectNo == 7) {
				System.out.println("조회할 부서명: ");
				scn.nextLine();
				String dept = scn.nextLine();
				System.out.println(dept);
				List<EmployeeVO> list = service.getDeptList(dept);
				for (EmployeeVO aa : list) {
					EmployeeVO vo = (EmployeeVO) aa;
					vo.showEmpInfo();
				}

			}

		} // end of while

	}// end of main
}// end of class
