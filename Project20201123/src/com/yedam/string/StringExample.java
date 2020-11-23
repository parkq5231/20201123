package com.yedam.string;

import java.io.UnsupportedEncodingException;

public class StringExample {

	public static void main(String[] args) {

		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}// end of switch

		String strVal1 = new String("김김");
		String strVal2 = "김김";

		if (strVal1 == strVal2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		if (strVal1.equals(strVal2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}

		System.out.println("-------------------");

		String str = "안녕하세요";

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1-> String: " + str1);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2-> String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3-> String: " + str3);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println("------------------");

		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련없는 책");

		}

		System.out.println("------------------");

		String ssn1 = "7306241230123";
		int length = ssn1.length();

		if (length == 13) {
			System.out.println("주민번호 자리수 맞");
		} else {
			System.out.println("주민번호 자리수 틀");
		}

		String oldStr = "자바는 객체지향언어.자바는 풍부한API";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);

		System.out.println("---------------");

		String ssn2 = "880815-1234567";
		String firstNum = ssn2.substring(0, 6);
		String secondNum = ssn2.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);

		System.out.println("---------------");

		String str3 = "Java Programming";
		String str4 = "JAVA Programming";

		System.out.println(str3.equals(str4));

		String lowerStr3 = str3.toLowerCase();
		String lowerStr4 = str4.toLowerCase();
		System.out.println(lowerStr3.equals(lowerStr4));

		System.out.println(str3.equalsIgnoreCase(str4));

		System.out.println("---------------------");

		String tel1 = " 02";
		String tel2 = "123 ";
		String tel3 = "    1234   ";

		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

		System.out.println("-------------------");

		String str5 = String.valueOf(10);
		String str6 = String.valueOf(10.5);
		String str7 = String.valueOf(true);

		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);

	}// end of main
}// end of class
