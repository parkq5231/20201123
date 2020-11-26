package com.yedam.board;

import java.util.List;

public class BoardServiceImpl implements BoardService{

	BoardDAO dao= new BoardDAO();

	@Override
	public List getList() {
		return dao.getList();
	}

	@Override
	public BoardVO getBoard(int Id) {
		return dao.getBoard(Id);
	}

	@Override
	public void insertBoard(BoardVO boardA) {
		dao.insertBoard(boardA);
	}
	
	@Override
	public void deleteBoard(int boardA) {
		dao.deleteBoard(boardA);
	}

	@Override
	public void updateBoard(BoardVO boardA) {
		dao.updateBoard(boardA);
	}


	
	
	
	
	
}
