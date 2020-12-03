package Example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numbers = new int[3];
		List num = new ArrayList();
		System.out.println("입력: ");
		// num =scn.nextInt();

		for (int i = 1; i <= numbers.length; i++) {
			if (true) {
				System.out.println(i + "번째 입력 :");
				numbers[i] = scn.nextInt();
			}
		}
	}// end of main

}// end of class
