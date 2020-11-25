package com.yedam.db2;

import java.util.List;

public interface EmpService {
	public List getEmpList();// 리스트 조회
	public EmployeeVO getEmp(int empId);// 아이디 기준 한건조회
	public void insertEmp(EmployeeVO empVo); // 입력
	public void updateEmp(EmployeeVO empVo);// 수정
	public void deleteEmp(int Id);// 삭제
}