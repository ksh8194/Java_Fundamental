package java_20190731;

import java.util.Calendar;

// one line comment

/*
 * multi line comment
 
  */


//java docs comment

/**
 Calendar 클래스는 년도별, 월별, 요일을 구할 수 있는 클래스 입니다.
 */

public class Calendar2 {
	public void print(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year,month-1,1);

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		// 들여쓰기 기능
		// 2019 07 1 = > 총 날짜를 구함
		// 7월 1일을 넣어야되서 마지막에 1 씀
		
		int dayOfWeek= c.get(Calendar.DAY_OF_WEEK);
		for(int i=1;i<dayOfWeek;i++) {
			System.out.print("\t");
		}
		
	
		
		for (int i = 1; i <= c.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i + "\t");
			if(dayOfWeek%7 == 0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		
		System.out.println();
		
	}
	
	
	
	
	
	public void print(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DATE);
		String message = null;
		if(dayOfWeek==Calendar.MONDAY) {
			message = "월요일";

		} else if (dayOfWeek == Calendar.TUESDAY) {

			message = "화요일";
		} else if (dayOfWeek == Calendar.WEDNESDAY) {

			message = "수요일";
		} else if (dayOfWeek == Calendar.THURSDAY) {

			message = "목요일";
		} else if (dayOfWeek == Calendar.FRIDAY) {

			message = "금요일";
		} else if (dayOfWeek == Calendar.SATURDAY) {
			message = "토요일";

		} else   {
			message = "일요일";

		}

		System.out.println(year + "년 " + month + "월 " + day + "일 " + message);

	}
	
	public void print(int year) {
		for(int i = 1; i<=12 ; i++) {
			
				System.out.println(i+"월");
				print(year , i);
				System.out.println();
			
		}
	}

}

