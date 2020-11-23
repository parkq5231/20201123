package com.yedam.address;

import java.util.Scanner;

public class FriendAddress2 {
	// 주소록 생성 프로그램
	public static void main(String[] args) {
		Friend[] friends = new Friend[100];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("---------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.종료");
			System.out.println("---------------------------");
			System.out.print("선택 > ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.println("친구이름: ");
				scn.nextLine();
				String name = scn.nextLine();
				System.out.println("전화번호: ");
				String phone = scn.nextLine();
				Friend frnd = new Friend(name, phone);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;// 한건 입력 후 빠져나온다는 의미
					}
				}

			} else if (selectNo == 2) {
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

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;// 한건 입력 후 빠져나온다는 의미
					}
				}

			} else if (selectNo == 3) {

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

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frnd;
						break;// 한건 입력 후 빠져나온다는 의미
					}
				}

			} else if (selectNo == 4) {

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						friends[i].showFriendInfo();
					}
				}

			} else if (selectNo == 5) {
				break;
			} else if (selectNo == 6) {
				System.out.println("연락처 검색: ");
				scn.nextLine();
				String number = scn.nextLine();
				// 연락처 입력 후 입력값을 number에 저장해준다 끝
				// 그 다음 저장한 값과 friend[i][1]을 비교 후 있다면
				// friend [i][1]을 출력해준다
				
				int i = 0;
				for (Friend sum : friends) {
				
					i++;
				}

			}

		} // end of while
		System.out.println("프로그램 종료.");

	}// end of main
}// end of class
