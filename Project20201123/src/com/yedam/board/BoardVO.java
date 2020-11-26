package com.yedam.board;

public class BoardVO {
	private int no;
	private String title;
	private String content;
	private String name;
	private String date;

	// 생성자
	public BoardVO() {

	}

	public BoardVO(int no, String title, String content, String name) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.name = name;

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void showInfo() {
		System.out.println("글번호: " + no + "| 제목: " + title + "| 내용: " + content + "| 작성자: " + name + "| 작성일자: " + date);
	}

}
