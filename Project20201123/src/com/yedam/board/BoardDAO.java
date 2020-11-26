package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement ppst;
	ResultSet rs;
	String sql;
	//전체보기
	public List getList() {
		conn = DAO.getConnection();
		sql = "SELECT * FROM board order by 1";
		List list = new ArrayList();

		try {
			ppst = conn.prepareStatement(sql);
			rs = ppst.executeQuery();
			while (rs.next()) {
				BoardVO aa = new BoardVO();
				aa.setNo(rs.getInt(1));
				aa.setTitle(rs.getString(2));
				aa.setContent(rs.getString(3));
				aa.setName(rs.getString(4));
				aa.setDate(rs.getString(5));
				list.add(aa);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	//상세보기
	public BoardVO getBoard(int Id) {
		conn = DAO.getConnection();
		sql = "SELECT * FROM board where board_no = ?";
		BoardVO aa = new BoardVO();

		try {
			ppst = conn.prepareStatement(sql);
			ppst.setInt(1, Id);
			rs = ppst.executeQuery();
			if (rs.next()) {
				aa.setNo(rs.getInt(1));
				aa.setTitle(rs.getString(2));
				aa.setContent(rs.getString(3));
				aa.setName(rs.getString(4));
				aa.setDate(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return aa;
	}
	//추가하기
	public void insertBoard(BoardVO boardA) {
		conn = DAO.getConnection();
		sql = "insert into board(board_no ,title,content,writer,creation_date)\r\n" + "values(?,?,?,?,sysdate)";

		try {
			ppst = conn.prepareStatement(sql);
			ppst.setInt(1, boardA.getNo());
			ppst.setString(2, boardA.getTitle());
			ppst.setString(3, boardA.getContent());
			ppst.setString(4, boardA.getName());


			int r = ppst.executeUpdate();
			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	//지우기
	public void deleteBoard(int Id) {
		conn = DAO.getConnection();
		sql = "delete from board where board_no = ?";

		try {
			ppst = conn.prepareStatement(sql);
			ppst.setInt(1, Id);
			int r = ppst.executeUpdate();
			System.out.println(r + "건이 삭제됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	//수정하기
	public void updateBoard(BoardVO boardA) {
		conn=DAO.getConnection();
		sql="UPDATE board\r\n"
				+ "SET TITLE = ?,CONTENT = ?"
				+ " WHERE board_no = ?";
		try {
			ppst=conn.prepareStatement(sql);
			
			ppst.setInt(3, boardA.getNo());
			ppst.setString(1, boardA.getTitle());
			ppst.setString(2, boardA.getContent());
			
			
			System.out.println(sql);
			
			int r = ppst.executeUpdate();
			System.out.println(r+"건이 수정됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
