package com.yedam.string;

public class Exercise123 {
	public static void main(String[] args) {

		String birth1 = "991123-1234567";
		String birth2 = "991112_2345678";
		String birth3 = "010101*3123456";
		String birth4 = "0202024211234";

		String[] births = { birth1, birth2, birth3, birth4 };

		for (int i = 0; i < births.length; i++) {
			char birth = births[i].charAt(7);
			
			switch (birth) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			}// end of switch
		}
		
		
	}// end of main
}// end of class
