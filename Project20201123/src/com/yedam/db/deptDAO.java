package com.yedam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class deptDAO {
	Connection conn = getConnection();

	public department[] getdepartsList() {
		String sql = "select * from departments";
		department[] departs = new department[100];
		try {

			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {

				department depart = new department();
				depart.setDepartmentId(rs.getInt("department_id"));
				depart.setDepartmentName(rs.getString("department_name"));
				depart.setManagerId(rs.getInt("manager_id"));
				depart.setLocationId(rs.getInt("location_id"));

				departs[i++] = depart;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return departs;
	}
	// DB연결 메소드
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}

}// end of class