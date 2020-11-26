package com.yedam.board;

import java.util.List;

public interface BoardService {
	public List getList();//전체조회
	public BoardVO getBoard(int no);//선택조회
	public void insertBoard(BoardVO boardA);//추가
	public void deleteBoard(int no);//삭제
	public void updateBoard(BoardVO boardA);//수정
	
}