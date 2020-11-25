package com.yedam.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {// 데이터 처리 기능을 넣을 것
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select* from emp1 order by 1";
		List list = new ArrayList();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				list.add(vo);// 위 두줄 입력한 값이 여기에 담김
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}
	// SQL에 연결 후 1로 정렬한 값을 pstmt에 담고
	// 그 tstmt에 담겨있는 값의 결과물을 int타입으로 rs에 담아준다
	// rs.next로 값이 있으면 실행하게 하고 while문 안에서
	// 인스턴스 생성 후 값을 조회하여 vo.set하여 vo에 값을 저장
	// 저장한 값을 list에 더해주고 리턴값으로 list

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "SELECT * FROM emp1 WHERE employee_id =?";
		EmployeeVO vo = new EmployeeVO();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}

	// 한건입력
	public void insertEmp(EmployeeVO Vo) {
		sql = "insert into emp1(employee_id,first_name,last_name,email,hire_date,job_id)\n" + "VALUES (?,?,?,?,?,?)";
		conn = DAO.getConnection();

		System.out.println(sql);
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, Vo.getEmployeeId());
			pstmt.setString(2, Vo.getFirstName());
			pstmt.setString(3, Vo.getLastName());
			pstmt.setString(4, Vo.getEmail());
			pstmt.setString(5, Vo.getHireDate());
			pstmt.setString(6, Vo.getJobId());

			int r = pstmt.executeUpdate();//
			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건수정
	public void updateEmp(EmployeeVO Vo) {
		if (Vo.getSalary() != 0) {
			sql = "update emp1\n" + "set email = nvl('" + Vo.getEmail() + ",email)" + "',phone_number=nvl('"
					+ Vo.getPhoneNumber() + ",phone_number)" + "',salary=nvl('" + Vo.getSalary() + ",salary)"
					+ "'where employee_id='" + Vo.getEmployeeId() + "'";
		} else {
			sql = "update emp1\n" + "set email = '" + Vo.getEmail() + "',phone_number='" + Vo.getPhoneNumber()
					+ "'where employee_id='" + Vo.getEmployeeId() + "'";
		}

		System.out.println(sql);
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 한건삭제
	public void deleteEmp(int empId) {
		sql = "delete from emp1 where employee_id=?";
		conn = DAO.getConnection();
		System.out.println(sql);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}// end of class