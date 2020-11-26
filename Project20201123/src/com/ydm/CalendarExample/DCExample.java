package com.ydm.CalendarExample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DCExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strnow1=now.toString();
		System.out.println(strnow1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2=sdf.format(now);
		System.out.println(strNow2);
		
		System.out.println("--------------------");
		
		Calendar now2 = Calendar.getInstance();
		
		
	}// end of main
}// end of class