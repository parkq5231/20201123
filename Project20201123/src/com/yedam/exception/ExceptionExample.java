package com.yedam.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int[] numbers = new int[4];
			numbers[3] = 10;
		} catch (Exception e) {
			System.out.println("에러");
		}

		try {
			String str = null;
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("출력값x");
		}

		System.out.println("종료..");

	}// end of main
}// end of class
