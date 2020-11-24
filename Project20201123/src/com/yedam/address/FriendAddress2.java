package com.yedam.address;

import java.util.Scanner;

public class FriendAddress2 {
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	// 주소록 생성 프로그램
	public static void main(String[] args) {

		while (true) {
			System.out.println("---------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.종료  6.한건검색");
			System.out.println("---------------------------");
			System.out.print("선택 > ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				addFriend();

			} else if (selectNo == 2) {
				addUnivFriend();

			} else if (selectNo == 3) {
				addCompFriend();

			} else if (selectNo == 4) {
				showFriendList();

			} else if (selectNo == 5) {
				break;
			} else if (selectNo == 6) {
				searchFriend();
			}

		} // end of while
		System.out.println("프로그램 종료.");

	}// end of main
		// 1.친구등록

	public static void addFriend() {
		System.out.println("친구이름: ");
		scn.nextLine();
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);

		insertFriend(frnd);

	}
	// 2.학교친구.
	public static void addUnivFriend() {
		System.out.println("친구이름: ");
		scn.nextLine();
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("학교이름: ");
		String univ = scn.nextLine();
		System.out.println("전공: ");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);

		insertFriend(frnd);
	}
	// 3.회사친구
	public static void addCompFriend() {
		System.out.println("친구이름: ");
		scn.nextLine();
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("회사이름: ");
		String company = scn.nextLine();
		System.out.println("부서정보: ");
		String department = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(company);
		frnd.setDepartment(department);

		insertFriend(frnd);
	}
	// 4.리스트
	public static void showFriendList() {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();
			}
		}

	}

	// 6.한건조회
	public static void searchFriend() {
		System.out.println("이름검색: ");
		scn.nextLine();
		String search = scn.nextLine();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (search.equals(friends[i].getName())) {
					friends[i].showFriendInfo();
					break;
				}
			}
		}
		
	}
	// 7.한건입력
	public static void insertFriend(Friend friend) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;// 한건 입력 후 빠져나온다는 의미
			}
		}
	}
}// end of class
