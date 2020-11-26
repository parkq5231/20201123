package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServiceImpl();

		while (true) {
			System.out.println("----------------------");
			System.out.println("1.리스트 2.상세화면 3.등록 4.삭제 5.수정 6.종료");
			System.out.println("----------------------");
			System.out.println("선택: ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				List list = service.getList();
				for (Object aa : list) {
					BoardVO brd = (BoardVO) aa;
					brd.showInfo();
				}

			} else if (selectNo == 2) {
				System.out.println("조회할 글 번호: ");
				int Id = scn.nextInt();
				BoardVO brd = service.getBoard(Id);

				brd.showInfo();

			} else if (selectNo == 3) {
				System.out.println("등록할 번호: ");
				int Id = scn.nextInt();
				scn.nextLine();
				System.out.println("제목: ");
				String title = scn.nextLine();
				System.out.println("내용: ");
				String content = scn.nextLine();
				System.out.println("작성자: ");
				String name = scn.nextLine();


				BoardVO all = new BoardVO();

				all.setNo(Id);
				all.setTitle(title);
				all.setContent(content);
				all.setName(name);


				service.insertBoard(all);

			} else if (selectNo == 4) {
				System.out.println("삭제할 번호: ");
				int Id = scn.nextInt();

				service.deleteBoard(Id);

			} else if (selectNo == 5) {
				System.out.println("수정할 글번호: ");
				int Id = scn.nextInt();
				scn.nextLine();
				System.out.println("제목: ");
				String title = scn.nextLine();
				System.out.println("내용: ");
				String content = scn.nextLine();
				System.out.println("작성자: ");
				String name = scn.nextLine();
	

				BoardVO all = new BoardVO(Id,title, content, name);

				BoardDAO aa=new BoardDAO();
				aa.updateBoard(all);
				
			} else if (selectNo == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}// end of main
}// end of class