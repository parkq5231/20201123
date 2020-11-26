package com.ydm.CalendarExample;


import java.time.DayOfWeek;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CalendarExample {
	public static void showCal(int year, int month) {
		
		System.out.println("	[" + year + "년 " + (month + 1) + "월 달력]");

		String[] Arrays = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < Arrays.length; i++) {
			System.out.printf("%4s", Arrays[i]);

		}

		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 1);
		System.out.println();

		int Day = cal.get(Calendar.DAY_OF_WEEK);
		int LDate = cal.getActualMaximum(Calendar.DATE);

		for (int i = 1; i < Day; i++) {
			String aa="   ";
			System.out.printf("%4s",aa);

		}
		int i=0;
		for (i = 1; i <= LDate; i++) {
			//List배열에 str타입의 Day와 int타입의 i가 들어간다면
			//순서상으로 if조건문에서 7번째마다 나머지가 0일때를 사용하여 결과가 나올듯
			List sum=List(Day,i);
			System.out.printf("%4d", i);	

			if (sum%7==0) {
				System.out.println();
			}
		}
		
		// DAY와 i의 값을 배열에 넣어 그 값의 i%7==0을 하면 될거같다
		
	
		
		

		System.out.println();
		System.out.println("시작요일: " + Day);
		System.out.println("마지막 날짜: " + LDate);

	}

	public static void main(String[] args) {
		showCal(2020, 11);

	}// end of main

}// end of class

//  {
//  
//  System.out.println("년도: " + cal.get(Calendar.YEAR));
//  System.out.println("월:"+cal.get(Calendar.MONTH)); System.out.println("날짜: "
//  +cal.get(Calendar.DATE)); System.out.println("요일: "
//  +cal.get(Calendar.DAY_OF_WEEK)); System.out.println("막날: "
//  +cal.getActualMaximum(Calendar.DATE)); Calendar cal= Calendar.getInstance();
//  
//  cal.set(2020, 1, 1);//2020년 5월 1일 //2020년 1월의 달력 }
// 