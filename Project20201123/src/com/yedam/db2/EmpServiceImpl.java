package com.yedam.db2;

import java.util.List;

public class EmpServiceImpl implements EmpService {// 데이터 접근 및 처리

	EmpDAO dao = new EmpDAO();

	@Override
	public List getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public EmployeeVO getEmp(int empId) {
		return dao.getEmp(empId);
	}

	@Override
	public void insertEmp(EmployeeVO empVo) {
		dao.insertEmp(empVo);
	}

	@Override
	public void updateEmp(EmployeeVO empVo) {
		dao.updateEmp(empVo);
	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
	}

	@Override
	public List<EmployeeVO> getDeptList(String dept) {
		return dao.getDeptList(dept);
	}

}// end of class